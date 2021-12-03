package jp.co.f1.basic.ch12;

public class UseMultipleInterfaceClass {

	public static void main(String[] args) {

		System.out.println("[Computer3オブジェクトの作成]");
		Computer3 com = new Computer3("Windows7", 3072);
		System.out.println("---------------------------------------");

		System.out.println("■Computer情報を表示");
		com.show();
		com.pshow();

	}

}
