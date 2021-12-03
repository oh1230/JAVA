package jp.co.f1.basic.ch12;

public class Computer1 extends Machinery {
	private String os;
	private int memory;

	public Computer1 (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show () {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}
