package jp.co.f1.intro.ch6;

public class LogicalOperator1 {

	public static void main(String[] args) {

		// 比較用の真偽値を管理するための変数
		boolean a = true;
		boolean b = false;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("a && b : " + (a && b));
		System.out.println("a || b : " + (a || b));
		System.out.println("!a  : " + (!a));

	}

}
