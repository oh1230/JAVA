package jp.co.f1.basic.ch12;

public class UseExtendsAbstractClass {

	public static void main(String[] args) {

		System.out.println("[Computer1オブジェクトの作成]");
		Computer1 com = new Computer1("Windows7", 3072);
		com.setEpower(350);
		System.out.println("---------------------------------------");

		System.out.println("[Television1オブジェクトの作成]");
		Television1 tv = new Television1();
		tv.setScreenSize(42);
		tv.setEpower(50);
		System.out.println("---------------------------------------");

		System.out.println("■Computer1情報を表示");
		com.show();
		System.out.println("■Television1情報を表示");
		tv.show();

	}

}
