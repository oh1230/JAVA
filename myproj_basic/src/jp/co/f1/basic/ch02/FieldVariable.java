package jp.co.f1.basic.ch02;

class Computer2 {
	String os;
	int memory;
}

public class FieldVariable {

	public static void main(String[] args) {

		Computer2 com = new Computer2();

		com.os = "WindowsXP";
		com.memory = 2048;

		System.out.println("パソコンのosは「" + com.os + "」です。");
		System.out.println("メモリサイズは「" + com.memory + "MByte」です。");

	}

}
