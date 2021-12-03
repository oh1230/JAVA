package jp.co.f1.basic.ch12;

public class UseImplementsInterface {

	public static void main(String[] args) {

		System.out.println("[Computer2オブジェクトの作成]");
		Computer2 com = new Computer2 ("Windows7", 3072);
		System.out.println("---------------------------------------");

		System.out.println("[Television2オブジェクトの作成]");
		Television2 tv = new Television2();
		tv.setScreenSize(42);
		System.out.println("---------------------------------------");

		System.out.println("■Computer2情報を表示");
		com.show();
		System.out.println("■Television2情報を表示");
		tv.show();

	}

}
