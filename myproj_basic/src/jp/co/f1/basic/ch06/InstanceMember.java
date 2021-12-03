package jp.co.f1.basic.ch06;

class Computer1 {
	private String os;
	private int memory;

	public Computer1 () {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました。");
	}

	public void setOsMemory (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」にメモリを「" + memory + "MByte」に変更しました。");
	}

	public void show () {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class InstanceMember {
	public static void main(String[] args) {

		Computer1 com1 = new Computer1();
		com1.setOsMemory("WindowsXP", 2048);
		com1.show();

		System.out.println("---------------------------------------------------------");

		Computer1 com2 = new Computer1();
		com2.setOsMemory("Windows2000", 512);
		com2.show();

	}

}
