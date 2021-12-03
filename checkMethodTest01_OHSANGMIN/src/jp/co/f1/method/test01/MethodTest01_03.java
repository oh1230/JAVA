package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_03 {

	static int inputAge () {

		//キーボード入力のためScannerクラスのインスタンス化
		Scanner sc = new Scanner(System.in);

		//年齢の入力
		System.out.print("年齢を入力してください＞");
		int age = sc.nextInt();

		return age;
	}

	public static void main(String[] args) {

		int age = inputAge();

		if (age >= 20) {
			System.out.println(age + " 才は成人です。");
		} else if (age < 20) {
			System.out.println(age + " 才は未成年です。");
		}

	}

}
