package jp.co.f1.basic.ch02;

class Computer7 {
	String os;
	int memory;

	// フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("OSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class NullInitializationObjectVariable {

	public static void main(String[] args) {
		// Computer7型のオブジェクト変数comを定義しnull値で初期化
		Computer7 com = null;

		// showメソッドにアクセス
		com.show();

	}

}
