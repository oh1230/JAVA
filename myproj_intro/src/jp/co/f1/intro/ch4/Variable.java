package jp.co.f1.intro.ch4;

public class Variable {

	public static void main(String[] args) {
		// 名前を管理する変数
		String name;
		name = "オ　サンミン";

		//身長を管理する変数
		double height;
		height = 173.1;

		//年齢を管理する変数
		int age;
		age = 27;

		//血液を管理する変数
		char blood;
		blood = 'O';

		System.out.print(name);
		System.out.print("さんの身長は");
		System.out.print(height);
		System.out.println("cm です。");

		System.out.print("年齢は");
		System.out.print(age);
		System.out.println("歳です。");

		System.out.print("血液型は");
		System.out.print(blood);
		System.out.println("型です。");

	}

}
