package jp.co.f1.method.test;

import java.util.Scanner;

public class IsEvenNumber {

	public static boolean isEvenNumber (int value) {

		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("キーボードから数値を入力してください：");
		int value = sc.nextInt();

		if (isEvenNumber(value) == true) {
			System.out.println(value + "は偶数です。");
		} else {
			System.out.println(value + "は奇数です。");
		}
	}

}
