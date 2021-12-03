package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS02 {

	public static void main(String[] args) {
		//ゲーム開始メッセージ
		System.out.println("ゲーム開始（正解数字：５）\n");

		//正解数字代入
		int answerNum = 5;

		//数字の入力
		System.out.print("　０から９までの予想の数字を入力＞＞");
		Scanner sc = new Scanner(System.in);
		int playerNum = sc.nextInt();

		if (answerNum > playerNum) {
			System.out.println("　　→正解数字は" + playerNum + "より大きいです。");
		} else if (answerNum < playerNum) {
			System.out.println("　　→正解数字は" + playerNum + "より小さいです。");
		} else {
			System.out.println("　　→！！大当たり！！");
		}

		//ゲーム終了メッセージ
		System.out.println("\nゲーム終了");

	}

}
