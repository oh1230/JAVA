package jp.co.f1.method.test;

public class PrintRandomMessage {

	public static void printRandomMessage () {

		int n = (int)(Math.random() * 3);

		String[] hello = { "こんばんは", "こんにちは", "おはよう" };

		System.out.println(hello[n]);

	}

	public static void main(String[] args) {

		printRandomMessage();

	}

}
