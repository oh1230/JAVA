/*
 * プログラム名：Step7：同一クラス内で処理をメソッド化する
 *  プログラムの説明：Step5のソースコードをもとに、
 *  				点数を評価する部分の処理をメソッド化します。
				メソッドは同一クラス内にインスタンスメソッドとして定義します。
 *  作成者：オ　サン　ミン
 *  作成日：2021/10/15
 */

package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS07 {

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

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("---点数評価プログラム開始---\n");

		//変数の初期化
		int sum = 0;
		int score = 0;
		int i = 0;
		int maxScore = -1;
		int minScore = 101;

		ScoreJudgeS07 eva = new ScoreJudgeS07();

		while (true) {
			//数字の入力
			System.out.print("＞");
			Scanner sc = new Scanner(System.in);
			String strScore = sc.nextLine();

			//q入力をしたらwhile文から抜け出す
			if (strScore.equals("q")) {
				System.out.println("→ｑが入力されたため、終了します。");
				break;
			}

			//String型をint型に変更
			score = Integer.parseInt(strScore);

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
