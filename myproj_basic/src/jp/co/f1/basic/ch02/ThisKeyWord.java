package jp.co.f1.basic.ch02;

class Computer9 {
	String os;
	int memory;

	 // メッセージとパソコン情報を表示するメソッド
	public void showComputer() {
		System.out.println("パソコンの情報を表示します。");
		// クラス内のshowメソッドを呼び出す
		this.show(); // thisキーワードを使用
	}

	// フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("パソコンのosは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}

	// フィールド変数よりOSの値を取得する
	public  String getOs() {
		return this.os;
	}

	// フィールド変数よりMemoryの値を取得する
	public int getMemory() {
		return this.memory;
	}

	// フィールド変数に値を設定するメソッド
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("osを「" + os + "」に、メモリサイズを「"
			+ memory + "MByte」に変更しました。");
	}

}

public class ThisKeyWord {

	public static void main(String[] args) {

		// Computer9 クラスからオブジェクトを生成する
		Computer9 com = new Computer9();

		//オブジェクトのフィールド変数に、各データを格納する
		com.os = "WindowsXP";
		com.memory = 2048;

		//メソッドを利用してフィールド変数に格納しているデータを取得
		System.out.println("パソコンのosは「" + com.getOs() + "」です。");
		System.out.println("メモリサイズは「" + com.getMemory() + "MByte」です。");

		// オブジェクトのフィールド変数に、各データを再格納する
		com.setOsMemory("Windows2000", 512);

		// showComputerメソッド呼び出し
		com.showComputer();

	}

}
