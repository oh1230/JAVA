/*
 * プログラム名：入力、その他のエラー処理を追加する
 *  プログラムの説明：	if文を利用した入力データのチェックと、
 *  					try～catch文を使用した例外処理を追加します。
 *  作成者：オ　サン　ミン
 *  作成日：2021/10/18
 */

package jp.co.f1.app.scorejudge;

import java.util.Scanner;


//EvaluateS09クラス定義
class EvaluateS10 {

	//インスタンスメソッド定義
	public char evaluateScore (int score) {

		if (score < 0 || 100 < score) {
			return 'Z';
		} else if (score < 60) {
			return 'F';
		} else if (score < 70) {
			return 'D';
		} else if (score < 80) {
			return 'C';
		} else if (score < 90) {
			return 'B';
		} else {
			return 'A';
		}

	}

}

public class ScoreJudgeS10 {
	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("---点数評価プログラム開始---\n");

		//変数の初期化
		int sum = 0;
		int score = 0;
		int i = 0;
		int maxScore = -1;
		int minScore = 101;

		//クラスメソッドの呼び出し
		EvaluateS10 eva = new EvaluateS10();

		while (true) {
			//数字の入力
			System.out.print("＞");
			Scanner sc = new Scanner(System.in);
			String strScore = sc.nextLine();

			//空文字の場合
			if (strScore.equals("")) {
				System.out.println("何も入力されていません。再度、0から100までの数字を入力してください。");
				continue;
			}

			//q入力をしたらwhile文から抜け出す
			if (strScore.equals("q")) {
				System.out.println("→ｑが入力されたため、終了します。\n");
				break;
			}

			//String型をint型に変更
			try {
				score = Integer.parseInt(strScore);
			} catch (NumberFormatException e) {
				System.out.println("文字列が入力されました。再度、0から100までの数字を入力してください。");
				continue;
			} catch (Exception e) {
				System.out.println(e + "という例外が発生しました。");
				continue;
			}

			if (eva.evaluateScore(score) == 'Z') {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
				continue;
			}

			System.out.println("→評価" + eva.evaluateScore(score) + "です。");

			if (maxScore < score) {
				maxScore = score;
			}

			if (minScore > score) {
				minScore = score;
			}

			sum += score; //合計点を入れる変数
			i++; //count変数
		}

		//平均点の変数を宣言
		double ave = (double) sum / i;

		System.out.println("----------サマリー---------");

		if (i == 0) {
			System.out.print("評価された人数が0名のためサマリーは表示しません。");
		} else {
			System.out.println(i + "名の成績を評価しました。");
			System.out.println("⊡最高点は" + maxScore + "点です。");
			System.out.println("⊡最低点は" + minScore + "点です。");
			System.out.println("⊡合計点は" + sum + "点です。");
			System.out.println("⊡平均点は" + ave + "点です。");
			System.out.println("--------------------------");
		}

		//プログラム終了メッセージ
		System.out.println("\n---点数評価プログラム終了---");

	}

}
