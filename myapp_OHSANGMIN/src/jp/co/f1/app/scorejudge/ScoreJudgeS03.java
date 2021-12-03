package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS03 {

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("---点数評価プログラム開始---\n");

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
			int score = Integer.parseInt(strScore);

			if (score <0 || score >100) {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
				continue;
			} else if (score >= 0 && score <59) {
				System.out.println("→評価Fです。");
			} else if (score >= 60 && score < 69) {
				System.out.println("→評価Dです。");
			} else if (score >= 70 && score < 79) {
				System.out.println("→評価Cです。");
			} else if (score >= 80 && score < 89) {
				System.out.println("→評価Bです。");
			} else if (score >= 90 && score <= 100) {
				System.out.println("→評価Aです。");
			}
		}

		//プログラム終了メッセージ
		System.out.println("\n---点数評価プログラム終了---");

	}

}
