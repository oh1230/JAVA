package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS01 {

	public static void main(String[] args) {
		//ゲーム開始メッセージ
		System.out.println("ゲーム開始\n");

		//正解数字代入
		int answerNum = 5;

		//数字の入力
		System.out.print("　０から９までの予想の数字を入力＞＞");
		Scanner sc = new Scanner(System.in);
		int playerNum = sc.nextInt();

		//結果表示
		System.out.println("→予想数字は" + playerNum + "です。");
		System.out.println("→正解数字は" + answerNum + "です。");

		System.out.println("\nゲーム終了");

	}

}
