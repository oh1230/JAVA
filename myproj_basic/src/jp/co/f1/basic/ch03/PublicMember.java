package jp.co.f1.basic.ch03;

class Computer3 {
	private String os;
	private int memory;

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}

	public void setOsMemory (String os, int memory) {
		if (memory > 0) {
			this.os = os;
			this.memory = memory;
			System.out.println("OSを「" + os + "」にメモリを「" + memory + "MByte」に変更しました。");
		} else {
			System.out.println("「" + memory + "」は正しいメモリサイズではないため、変更は行いません。");
		}
	}


}

public class PublicMember {
	public static void main(String[] args) {
		Computer3 com = new Computer3();

		com.setOsMemory("WindowsXP", 2048);
		com.show();

		System.out.println("\nメモリに不正な値(-5445)を指定してみます。");
		com.setOsMemory("WindowsXP", -5445);
		com.show();
	}
}
