package jp.co.f1.basic.ch12;

public class Television1 extends Machinery {

	private int screenSize;

	public Television1 () {
		this.screenSize = 0;
		System.out.println("テレビを作成しました。");
	}

	public void setScreenSize (int screenSize) {
		this.screenSize = screenSize;
		System.out.println("画面サイズは" + screenSize + "型にしました。");
	}

	public void show () {
		System.out.println("テレビの画面サイズは" + this.screenSize + "型です。");
	}

}
