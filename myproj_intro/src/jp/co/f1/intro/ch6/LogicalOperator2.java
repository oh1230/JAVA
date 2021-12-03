package jp.co.f1.intro.ch6;

public class LogicalOperator2 {

	public static void main(String[] args) {

		// 比較用の真偽値を管理するための変数
		int a = 5;

		 System.out.println("*****if 文の判定開始*****");

		 if (0 <= a && a <= 10) {
			 System.out.println("変数 a は 0 以上 10 以下。");
		 } else {
			 System.out.println("変数 a は 0 以上 10 以下ではない。");
		 }

		 System.out.println("*****if 文の判定終了*****");

	}

}
