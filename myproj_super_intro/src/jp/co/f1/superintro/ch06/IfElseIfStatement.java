package jp.co.f1.superintro.ch06;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 5;

		System.out.print("数値を入力　＞　");
		int num2 = sc.nextInt();

		if(num2 > num1) {
			System.out.println(num1 + "より" + num2 + "の方が大きいです。");
		} else if(num2 < num1) {
			System.out.println(num1 + "より" + num2 + "の方が小さいです。");
		} else {
			System.out.println("num1とnum2の数値は同じです。");
		}

	}

}
