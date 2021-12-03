package jp.co.f1.intro.ch9;

public class ArrayInitializer {

	public static void main(String[] args) {

		//　住居年数を管理する為の配列変数の宣言と要素の作成
		int [] kandaMansion = new int [3];

		//　要素の初期化
		kandaMansion[0] = 3;
		kandaMansion[1] = 1;
		kandaMansion[2] = 10;

		System.out.println(" - 神田マンション1号棟の移住年数 - ");
		System.out.println("０号室の値：" + kandaMansion[0]);
		System.out.println("１号室の値：" + kandaMansion[1]);
		System.out.println("２号室の値：" + kandaMansion[2]);

		System.out.println();

		//　住居年数を管理する為の配列変数の宣言と要素の初期化
		int [] kandaMansion2 = { 3, 1, 10 };

		System.out.println(" - 神田マンション2号棟の移住年数 - ");
		System.out.println("０号室の値：" + kandaMansion2[0]);
		System.out.println("１号室の値：" + kandaMansion2[1]);
		System.out.println("２号室の値：" + kandaMansion2[2]);

	}

}
