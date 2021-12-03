package jp.co.f1.basic.ch11;

public class NotePc3 extends Computer1 {
	private String useType;

	public NotePc3 () {
		this.useType = null;
		System.out.println("ノートパソコンを作成しました。");
	}

	public NotePc3 (String os, int memory, String useType) {
		super (os, memory);
		this.useType = useType;
		System.out.println("タイプは" + this.useType + "用のノートパソコンを作成しました。");
	}

	public void setUseType (String useType) {
		this.useType =useType;
		System.out.println("タイプは\" + this.useType + \"用にしました。");
	}

	public void showInfo () {
		System.out.println("このノートパソコンのOSは" + super.os + "です。");
		 System.out.println("メモリサイズは" + super.memory + "です。");
		 System.out.println("タイプは" + this.useType + "用です。");
	}
}
