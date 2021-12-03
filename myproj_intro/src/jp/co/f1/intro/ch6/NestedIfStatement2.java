package jp.co.f1.intro.ch6;

public class NestedIfStatement2 {

	public static void main(String[] args) {

		//比較用の数値を管理するための変数
		int a = 15;

		System.out.println("*****if 文の判定開始*****");

		if (a >= 0) {
			System.out.println("変数 a は 0 以上。");
			if(a <= 10) {
				System.out.println("変数 a は 10 以下。");
			} else {
				System.out.println("変数 a は 10 より大きい。");
			}
		}

		System.out.println("*****if 文の判定終了*****");

	}

}
