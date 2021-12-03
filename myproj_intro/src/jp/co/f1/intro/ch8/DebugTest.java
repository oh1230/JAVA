package jp.co.f1.intro.ch8;

import java.util.Scanner;

/*
 * ランダムに作成した数字とユーザーが入力した数字を比較し、
 *一致したら「当たり」、不一致なら「ハズレ」と表示するプログラム
 */

public class DebugTest {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 10); //ランダムに生成した０－９の数値
		int playerNum;

		System.out.print("０から９までの数字を入力してください＞");
		playerNum = readInt();

		//ランダム生成した数値と、ユーザーが入力した数値を比較する
		if (randomNum == playerNum) {
			System.out.println("【当たり】");
		} else {
			System.out.println("【ハズレ】");
		}
	}

	/**
	 *ユーザーに値を入力させる。
	 *
	 *@return 入力された数値。
	 */
	static int readInt() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		return i;
	}
}
