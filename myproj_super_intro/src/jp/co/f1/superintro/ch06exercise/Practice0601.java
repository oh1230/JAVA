package jp.co.f1.superintro.ch06exercise;

import java.util.Scanner;

public class Practice0601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//数値の入力
		System.out.print("数値を入力--＞");
		int a = sc.nextInt();

		if(a % 2 == 0) {
			System.out.print("入力数値[" + a + "]は偶数です。");
		} else {
			System.out.print("入力数値[" + a + "]は奇数です。");
		}

	}

}
