package jp.co.f1.basic.ch03;

class Computer1 {
	String os;
	int memory;

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class DirectAccessObjectVariable {

	public static void main(String[] args) {

		Computer1 com = new Computer1();

		com.os = "WindowsXP";
		com.memory = -5445;

		com.show();
	}

}
