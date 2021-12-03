package jp.co.f1.basic.test;

public class Student {

	public static int count; //クラス変数
	private String name; // インスタンス変数

	//コンストラクタ
	public Student (String name) {
		this.name = name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getName () {
		return this.name;
	}

	//クラス変数count を1 加算するインスタンスメソッド
	public void plusCount () {
		count++;
	}

	//クラス変数count をコンソールに出力するクラスメソッド
	static void showCount () {
		System.out.println("生徒数は" + count + "名です。");
	}

}
