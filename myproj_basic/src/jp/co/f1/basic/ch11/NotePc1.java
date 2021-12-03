package jp.co.f1.basic.ch11;

public class NotePc1 extends Computer1 {
	private String useType;

	public NotePc1 () {
		this.useType = null;
		System.out.println("ノートパソコンを作成しました。");
	}

	public void setUseType (String useType) {
		this.useType = useType;
		System.out.println("タイプは" + this.useType + "用にしました。");
	}
}
