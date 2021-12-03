package jp.co.f1.basic.ch12;

public class Computer3 implements IMachinery, IProduction {
	private String os;
	private int memory;

	public Computer3 (String os, int memory) {
		this.os = os;
		this.memory = memory;

		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "MByte」のパソコンを作成しました。");
	}

	public void show () {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
		System.out.println("製造元は「" + MANUFACTURER + "」です。");
	}

	public void pshow() {
		System.out.println("このパソコンの製造は2011/1/1です。");
	}

}
