package jp.co.f1.basic.ch02exercise;

public class Person03 {
	String name;
	int age;

	// フィールド変数の値を画面にメッセージとして出力する
	public void showPerson () {
		System.out.println("この人の名前は" +this. name + "で、年齢は" + this.age + "歳です。");
	}

	// メソッド①
	public void setName(String name) {
		this.name = name;
	}

	// メソッド②
	public void setAge(int age) {
		this.age = age;
	}

	// メソッド③
	public String getName() {
		return this.name;
	}

	// メソッド④
	public int getAge() {
		return this.age;
	}
}
