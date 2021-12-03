package jp.co.f1.intro.ch9;

public class ChangeArrayElement1 {

	public static void main(String[] args) {

		//　住居年数を管理する為の配列変数の宣言と要素の初期化
		int [] kandaMansion = { 3, 1, 10 };

		System.out.println("０号室の値：" + kandaMansion[0]);
		System.out.println("１号室の値：" + kandaMansion[1]);
		System.out.println("２号室の値：" + kandaMansion[2]);

		//　一部の配列の要素に値を代入
		kandaMansion[1] = 2;

		System.out.println();
		System.out.println(" -- 変更後の住居年数 -- ");

		System.out.println("０号室の値：" + kandaMansion[0]);
		System.out.println("１号室の値：" + kandaMansion[1]);
		System.out.println("２号室の値：" + kandaMansion[2]);

	}

}
