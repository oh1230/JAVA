package jp.co.f1.basic.ch09;

public class AssignValueOfClassType1 {

	public static void main(String[] args) {

		System.out.println("com1を宣言しました。");
		Computer1 com1 = new Computer1();

		com1.setComputer("WindowsXP", 1024);

		System.out.println("com2を宣言しました。");
		Computer1 com2;

		System.out.println("com2にcom1を代入しました。");
		com2 = com1;

		System.out.println("\n-[情報変更前のPC情報表示]-------------");
		 System.out.print("com1の");
		 com1.show();

		 System.out.println();
		 System.out.print("com2の");
		 com2.show();
		 System.out.println("--------------------------------------\n");

	}

}
