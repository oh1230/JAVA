package jp.co.f1.basic.ch02exercise;

class Person04 {
	String name;
	int age;

	// フィールド変数の値を画面にメッセージとして出力する
		public void showPerson () {
			System.out.println("この人の名前は" +this. name + "で、年齢は" + this.age + "歳です。");
		}
}

public class Practice0202 {
	public static void main(String[] args) {
		// Person04オブジェクトを作成
		Person04 person = new Person04();

		// オブジェクトに値を設定
		person.name = "神田太郎";
		person.age = 30;

		// オブジェクト変数にnullを代入
		person = null;

		// メソッドにアクセスし個々の結果を表示する
		person.showPerson();

	}

}
