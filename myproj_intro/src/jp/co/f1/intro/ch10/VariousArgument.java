package jp.co.f1.intro.ch10;

public class VariousArgument {

	static void checkPass(String name, int point, int passport) {

		System.out.print(name + "は、");
		if (point >= passport) {
			System.out.println(point + "点なので合格です。");
		} else {
			System.out.println(point + "点なので不合格です。");
		}
		System.out.println("　ー　ー　ー　");
	}

	public static void main(String[] args) {

		//　点数を管理する変数の宣言と初期化
		int pointA = 85;
		int pointB = 32;
		int pointC = 60;
		int pointD = 40;

		checkPass("A君", pointA, 50);

		checkPass("B君", pointB, 50);

		checkPass("Cさん", pointC, 50);

		checkPass("Dさん", pointD, 50);

	}

}
