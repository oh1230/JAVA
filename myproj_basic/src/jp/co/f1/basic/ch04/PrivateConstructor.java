package jp.co.f1.basic.ch04;

class Computer3 {
	private String os;
	private int memory;

	private Computer3 (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {

		System.out.println("--newの前--");
		Computer3 com = new Computer3("Windows", 2048);
		System.out.println("--newの後--");
		com.show();

	}

}
