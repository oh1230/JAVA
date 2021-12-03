package jp.co.f1.intro.ch10exercise;

public class Practice1002 {

	static void checkAge (int tmpAge) {
		if (tmpAge >= 20) {
			System.out.println(tmpAge + "歳は通常料金です。");
		} else {
			System.out.println(tmpAge + "歳は半額料金です。");
		}
	}

	public static void main(String[] args) {

		int age;

		age = 10;
		checkAge(age);

		age = 20;
		checkAge(age);

	}

}
