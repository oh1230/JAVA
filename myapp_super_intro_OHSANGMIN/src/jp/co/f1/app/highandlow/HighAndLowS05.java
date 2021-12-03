/*
 * プログラム名　：　myapp_super_intro_OHSANGMIN
 * プログラム説明　：　High＆Low ゲーム
 * 作成者　：　オ　サン　ミン
 * 作成日　：　2021年10月5日
 */

package jp.co.f1.app.highandlow;

import java.util.Scanner;

public class HighAndLowS05 {

	public static void main(String[] args) {

		System.out.println("************");
		System.out.println("*High & Low*");
		System.out.println("************");
		System.out.println();

		int leftCard = (int)(Math.random()*9)+1;
		System.out.println("  [問題表示]");
		System.out.println("*****  *****");
		System.out.println("*   *  *****");
		System.out.println("* " + leftCard + " *  *****");
		System.out.println("*   *  *****");
		System.out.println("*****  *****");
		System.out.println();

		System.out.print(" High or Low ? (h/l) > ");
		Scanner sc = new Scanner(System.in);
		String select = sc.nextLine();

		if(select.equals("h")) {
			System.out.println("→Highを選択しました。");
		} else {
			System.out.println("→Lowを選択しました。");
		}
		System.out.println();

		int rightCard = (int)(Math.random()*9)+1;
		System.out.println("  [結果表示]");
		System.out.println("*****  *****");
		System.out.println("*   *  *   *");
		System.out.println("* " + leftCard + " *  * " + rightCard + " *");
		System.out.println("*   *  *   *");
		System.out.println("*****  *****");

		System.out.println();
		System.out.println("--ゲーム終了--");

	}

}
