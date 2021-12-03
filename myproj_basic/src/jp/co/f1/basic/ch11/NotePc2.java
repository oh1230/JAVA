package jp.co.f1.basic.ch11;

public class NotePc2 extends Computer1 {
	private String useType;

	public NotePc2 () {
		this.useType = null;
		System.out.println("ノートパソコンを作成しました。");
	}

	public NotePc2 (String os, int memory, String useType) {
		super (os, memory);
		this.useType = useType;
		System.out.println("タイプは" + this.useType + "用のノートパソコンを作成しました。");
	}

	public void setUseType (String useType) {
		this.useType = useType;
		System.out.println("タイプは" + this.useType + "用にしました。");
	}

}
