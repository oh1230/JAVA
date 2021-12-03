package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_04 {

	//2乗するメソッド
	static int pow2 (int pow2Num) {

		int pow2Result = pow2Num * pow2Num;

		return pow2Result;
	}

	public static void main(String[] args) {

		//キーボード入力のためScannerクラスのインスタンス化
		Scanner sc = new Scanner(System.in);

		System.out.print("数値を入力＞");
		int num = sc.nextInt();

		//入力されたデータをpow2メソッドに代入
		int pow2Result = pow2(num);

		System.out.println(num + "の2乗は" + pow2Result + "です。");

	}

}
