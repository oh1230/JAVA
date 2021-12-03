package jp.co.f1.intro.ch6;

public class LogicalOperator5 {

	public static void main(String[] args) {

		// 比較用の真偽値を管理するための変数
		int a = 5;

		 System.out.println("*****if 文の判定開始*****");

		 if (a <= 0 || 10 <= a) {
			 System.out.println("変数 a は 0 以下 もしくは 10 以上。");
		 } else {
			 System.out.println("変数 a は 0 超過 10 未満。");
		 }

		 System.out.println("*****if 文の判定終了*****");

	}

}
