package jp.co.f1.basic.ch06;

class Computer2 {
	private String os;
	private int memory;
	public static int sum;

	public Computer2 () {
		this.os = null;
		this.memory = 0;
		sum++;
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

	public static void showSum() {
		System.out.println("■パソコンは合計" + sum + "台作成されています。");
	}
}

public class ClassMember {
	public static void main(String[] args) {

		Computer2.sum = 0;
		Computer2.showSum();

		Computer2 com1 = new Computer2();
		com1.setOsMemory("WindowsXp", 2048);
		com1.show();
		Computer2.showSum();

		Computer2 com2 = new Computer2();
		com2.setOsMemory("Windows2000", 512);
		com2.show();
		Computer2.showSum();

	}

}
