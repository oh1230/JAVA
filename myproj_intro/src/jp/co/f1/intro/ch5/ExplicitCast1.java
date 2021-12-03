package jp.co.f1.intro.ch5;

public class ExplicitCast1 {

	public static void main(String[] args) {

		// double  型の平均点を管理する変数
		double doubleAve;;

		// int  型の平均点を管理する変数
		int intAve;;

		doubleAve = 65.5;

		System.out.print("平均点は");
		System.out.print(doubleAve);
		System.out.println("点です。");

		intAve = (int)doubleAve;

		System.out.print("int 型にキャストすると");
		System.out.print(intAve);
		System.out.println("点です。");

	}

}
