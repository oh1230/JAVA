package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS02 {

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("---点数評価プログラム開始---\n");

		//数字の入力
		System.out.print("＞");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score >= 0 && score <59) {
			System.out.println("→評価Fです。");
		} else if (score >= 60 && score < 69) {
			System.out.println("→評価Dです。");
		} else if (score >= 70 && score < 79) {
			System.out.println("→評価Cです。");
		} else if (score >= 80 && score < 89) {
			System.out.println("→評価Bです。");
		} else if (score >= 90 && score <= 100) {
			System.out.println("→評価Aです。");
		} else {
			System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
		}

		//プログラム終了メッセージ
		System.out.println("\n---点数評価プログラム終了---");

	}

}
