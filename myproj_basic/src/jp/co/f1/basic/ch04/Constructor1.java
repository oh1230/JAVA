package jp.co.f1.basic.ch04;

class Computer1 {
	private String os;
	private int memory;

	public Computer1 () {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました。");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class Constructor1 {
	public static void main(String[] args) {

		System.out.println("--「引数なしコンストラクタ」の実行前--");
		Computer1 com = new Computer1();
		System.out.println("--「引数なしコンストラクタ」の実行後--");
		com.show();

	}

}
