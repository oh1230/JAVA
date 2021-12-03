package jp.co.f1.intro.ch10;

public class NoMethod {

	public static void main(String[] args) {

		//点数を管理する変数の宣言と初期化
		int pointA = 85;
		int pointB = 32;
		int pointC = 60;
		int pointD = 40;

		System.out.print("A君は、");
		if (pointA >= 50) {
			System.out.println(pointA + "点なので合格です。");
		} else {
			System.out.println(pointA + "点なので不合格です。");
		}
		System.out.println(" - - - ");

		System.out.print("B君は、");
		if (pointB >= 50) {
			System.out.println(pointB + "点なので合格です。");
		} else {
			System.out.println(pointB + "点なので不合格です。");
		}
		System.out.println(" - - - ");

		System.out.print("Cさんは、");
		if (pointC >= 50) {
			System.out.println(pointC + "点なので合格です。");
		} else {
			System.out.println(pointC + "点なので不合格です。");
		}
		System.out.println(" - - - ");

		System.out.print("Dさんは、");
		if (pointD >= 50) {
			System.out.println(pointD + "点なので合格です。");
		} else {
			System.out.println(pointD + "点なので不合格です。");
		}
		System.out.println(" - - - ");


	}

}
