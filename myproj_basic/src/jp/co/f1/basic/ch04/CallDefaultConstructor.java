package jp.co.f1.basic.ch04;

class Computer4 {
	private String os;
	private int memory;

	// コンストラクタ定義なし

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class CallDefaultConstructor {
	public static void main(String[] args) {

		 System.out.println("--オブジェクト生成前--");
		 Computer4 com = new Computer4();
		 System.out.println("--オブジェクト生成後--");
		 com.show();

	}

}
