package ch04;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GuessServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		try {
			// 文字コードの設定
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain; charest=UTF-8");

			// セッションオブジェクトの取得
			HttpSession session = request.getSession();

			Integer answerNumber = null; // 正解数字用変数
			ArrayList<NumberInfo> list = null; // 履歴用変数
			String message = ""; // メッセージ用変数

			// ゲーム制御フラグを取得
			String cmd = request.getParameter("cmd");

			// 初回アクセス、または再チャレンジ時の初期化処理
			if (cmd == null || cmd.equals("first")) {
				list = new ArrayList<NumberInfo>();
				cmd = "first";
				answerNumber = new Random().nextInt(10);
				session.setAttribute("answer", answerNumber);

				// ゲームが継続中の処理
			} else if (cmd.equals("game")) {

				// 入力数値、履歴、回答数値の取得
				String strUserNumber = (String) request.getParameter("user_number");
				list = (ArrayList<NumberInfo>) session.getAttribute("list");
				answerNumber = (Integer) session.getAttribute("answer");

				int intUserNumber = -1; // 入力数値用変数
				String judge = ""; // 判定用変数

				// エラーチェック
				if (strUserNumber.equals("")) {
					message = "何も入力されていません";
				} else {
					try {
						intUserNumber = Integer.parseInt(strUserNumber);
						if (intUserNumber < 0 || 9 < intUserNumber) {
							message = "0から9までの数字を入力してください";
						}
					} catch (NumberFormatException e) {
						message = "数字を入力してください";
					}
				}

				// エラーがない場合、判定処理
				if (message.equals("")) {
					if (answerNumber == intUserNumber) {
						judge = "当たり";
						cmd = "end";
						message = intUserNumber + " は、当たりです";
					} else {
						judge = "はずれ";
						message = intUserNumber + " は、はずれです";
					}
					// 入力数値、判定を履歴に追加
					NumberInfo objNumberInfo = new NumberInfo();
					objNumberInfo.setUserNumber(Integer.toString(intUserNumber));
					objNumberInfo.setJudge(judge);
					list.add(objNumberInfo);
				}
			}

			// ゲーム制御フラグ、メッセージをリクエストスコープへ登録
			request.setAttribute("cmd", cmd);
			request.setAttribute("message", message);
			// 履歴をセッションへ登録
			session.setAttribute("list", list);
			// JSPへ画面遷移
			request.getRequestDispatcher("/view/ch04/guess.jsp").forward(request, response);

			// 予期しない例外が発生した場合の画面遷移
		} catch (Exception e) {
			String message = "予期せぬエラーが発生しました<br>" + e.toString();
			request.setAttribute("cmd", "end");
			request.setAttribute("message", message);
			request.getRequestDispatcher("/view/ch04/guess.jsp").forward(request, response);
		}
	}
}