package jp.co.f1.method.test;

public class GetMinValue {

	public static double getMinValue (double a, double b) {

		double minValue;

		if (a < b) {
			minValue = a;
			System.out.print("変数aと変数bで小さいのは、「変数aの");
		} else {
			minValue = b;
			System.out.print("変数aと変数bで小さいのは、「変数bの");
		}
		return minValue;

	}

	public static void main(String[] args) {

		double a = 3.55;
		double b = 2.92;

		double minValue = getMinValue(a, b);

		System.out.println(minValue + "」です。");

	}

}
