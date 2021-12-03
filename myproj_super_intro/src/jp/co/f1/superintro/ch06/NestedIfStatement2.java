package jp.co.f1.superintro.ch06;

public class NestedIfStatement2 {

	public static void main(String[] args) {
		//比較用の数値を管理するための変数aを宣言し、7で初期化
		int a = 33;

		System.out.println("*****if文の判定開始*****");

		if(a >= 0) {
			System.out.println("変数aは0以上。");
			if(a <= 10) {
				System.out.println("変数aは10以下。");
			} else {
				System.out.println("変数aは10より大きい。");
			}
		}

		System.out.println("*****if文の判定終了*****");

	}

}
