package jp.co.f1.intro.ch10;

public class Method {

	static void checkPass (int point) {
		if (point >= 50) {
			System.out.println(point + "点なので合格です。");
		} else {
			System.out.println(point + "点なので不合格です。");
		}
		System.out.println(" - - - ");
	}

	public static void main(String[] args) {

		//点数を管理する変数の宣言と初期化
		int pointA = 85;
		int pointB = 32;
		int pointC = 60;
		int pointD = 40;

		System.out.print("A君は、");
		checkPass(pointA);

		System.out.print("B君は、");
		checkPass(pointB);

		System.out.print("C君は、");
		checkPass(pointC);

		System.out.print("D君は、");
		checkPass(pointD);

	}

}
