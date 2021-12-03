package jp.co.f1.superintro.ch05;

import java.util.Scanner;

public class KeyBoardInputIntValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1つ目の数字を入力して下さい＞");
		int num1 = sc.nextInt();
		System.out.print("2つ目の数字を入力して下さい＞");
		int num2 = sc.nextInt();

		System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));

	}

}
