package jp.co.f1.basic.ch12;

public class Computer2 implements IMachinery {
	private String os;
	private int memory;

	public Computer2 (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
		System.out.println("製造元は「" + MANUFACTURER + "」です。");
	}
}
