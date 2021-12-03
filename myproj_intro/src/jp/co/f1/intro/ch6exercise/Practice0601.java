package jp.co.f1.intro.ch6exercise;

import java.util.Scanner;

public class Practice0601 {

	public static void main(String[] args) {

		System.out.print("数値を入力--＞");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a % 2 == 0) {
			System.out.print("入力数値「" + a + "」は偶数です。");
		} else {
			System.out.print("入力数値「" + a + "」は奇数です。");
		}

	}

}
