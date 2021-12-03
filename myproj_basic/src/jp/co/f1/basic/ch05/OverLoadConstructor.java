package jp.co.f1.basic.ch05;

class Computer3 {
	private String os;
	private int memory;

	public Computer3() {
		this.os = null;
		this.memory = 0;
	}

	public Computer3 (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show () {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}

}

public class OverLoadConstructor {
	public static void main(String[] args) {

		Computer3 com1 = new Computer3();

		com1.show();
		System.out.println("-----------------------------------------------------------------");

		Computer3 com2 = new Computer3("WindowsXP", 2048);
		com2.show();

	}

}
