package jp.co.f1.basic.ch05;

class Computer4 {
	private String os;
	private int memory;

	public Computer4 () {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました。");
	}

	public Computer4 (String os, int memory) {
		this();
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show () {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class NestedConstructor {
	public static void main(String[] args) {

		Computer4 com = new Computer4 ("WindowsXP", 2048);
		com.show();
	}
}
