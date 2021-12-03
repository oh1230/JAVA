package jp.co.f1.basic.ch11;

public class UseEqualsMethod {

	public static void main(String[] args) {

		Computer5 com1 = new Computer5();
		Computer5 com2 = new Computer5();
		Computer5 com3 = com1;

		boolean check1 = com1.equals(com2);
		boolean check2 = com1.equals(com3);

		System.out.println("com1とcom2の比較結果は" + check1 + "です。");
		System.out.println("com1とcom3の比較結果は" + check2 + "です。");

	}

}
