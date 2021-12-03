package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_02 {

	static void printAge (int  age) {
		if (age >= 20) {
			System.out.println(age + " 才は成人です。");
		} else if (age < 20) {
			System.out.println(age + " 才は未成年です。");
		}
	}

	public static void main(String[] args) {

		//キーボード入力のためScannerクラスのインスタンス化
		Scanner sc = new Scanner(System.in);

		System.out.print("年齢を入力してください＞");
		int age = sc.nextInt();

		//入力された数値を定義したメソッドに代入
		printAge(age);

	}

}
