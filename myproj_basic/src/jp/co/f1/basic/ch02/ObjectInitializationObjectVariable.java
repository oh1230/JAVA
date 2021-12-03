package jp.co.f1.basic.ch02;

class Computer8 {
	String os;
	int memory;

	// フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("OSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class ObjectInitializationObjectVariable {
	public static void main(String[] args) {

		// Computer8型のオブジェクト変数com1を宣言とオブジェクトの生成
		Computer8 com1 = new Computer8();
		// com1オブジェクトの各値を設定
		com1.os = "WindowsXP";
		com1.memory = 2048;

		// Computer8型のオブジェクト変数com2を宣言と同時に別変数で初期化
		Computer8 com2 = com1;
		System.out.println("com2にcom1を代入しました。\n");

		// com1のshowメソッドにアクセス
		System.out.print("com1のさすパソコンの");
		com1.show();

		// com2のshowメソッドにアクセス
		System.out.print("com2のさすパソコンの");
		com2.show();

	}

}
