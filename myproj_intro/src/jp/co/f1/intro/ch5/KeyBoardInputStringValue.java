package jp.co.f1.intro.ch5;

import java.util.Scanner;

public class KeyBoardInputStringValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1つ目の数字を入力して下さい＞");
		String str = sc.nextLine();
		int num1 = Integer.parseInt(str);

		System.out.print("2つ目の数字を入力して下さい＞");
		String str = sc.nextLine();
		int num2 = Integer.parseInt(str);

		System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));

	}

}
