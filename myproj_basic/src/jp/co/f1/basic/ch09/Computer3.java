package jp.co.f1.basic.ch09;

public class Computer3 {
	private String os;
	private int memory;

	public Computer3 () {
		this.os = "";
		this.memory = 0;
	}

	public Computer3 (String os, int memory) {
		this.os = os;
		this.memory = memory;
	}

	public String getOs () {
		return os;
	}

	public int getMemory () {
		return memory;
	}

	public void setOs (String os) {
		this.os = os;
	}

	public void setMemory (int memory) {
		this.memory = memory;
	}

	public void show () {
		System.out.println("パソコンのOSは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}

}
