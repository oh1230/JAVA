package jp.co.f1.basic.ch11;

public class Computer5 {

	private String os;
	private int memory;

	public Computer5 () {
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
