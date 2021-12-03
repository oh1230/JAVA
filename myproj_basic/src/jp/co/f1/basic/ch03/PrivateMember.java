package jp.co.f1.basic.ch03;

class Computer2 {
	private String os;
	private int memory;

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class PrivateMember {
	public static void main(String[] args) {
		Computer2 com = new Computer2();

		com.os = "WindowsXP";
		com.memory = -5445;

		com.show();
	}
}
