package jp.co.f1.basic.ch05exercise;

class Calc2 {

	public int addition (int num1, int num2) {
		return num1 + num2;
	}

	public double addition (double num1, double num2) {
		return num1 + num2;
	}
}


public class Practice0501 {

	public static void main(String[] args) {

		Calc2 calc = new Calc2();

		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + " + " + num2 + " = " + calc.addition(num1, num2) );

		double num3 = 45.2;
		double num4 = 16.9;

		System.out.println(num3 + " + " + num4 + " = " + calc.addition(num3, num4) );
	}
}
