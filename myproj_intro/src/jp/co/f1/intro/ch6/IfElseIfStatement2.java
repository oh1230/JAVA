package jp.co.f1.intro.ch6;

public class IfElseIfStatement2 {

	public static void main(String[] args) {

		//比較用の値を管理するための変数
		int a = 2;

		 System.out.println("*****if 文の判定開始*****");

		 if (a == 1) {
			 System.out.println("変数 a と 1 は等しい。");
		 } else if (a == 2) {
			 System.out.println("変数 a と 2 は等しい。");
		 } else {
			 System.out.println("変数 a と 1 とも 2 ともは等しくない。");
		 }

		 System.out.println("*****if 文の判定終了*****");

	}

}
