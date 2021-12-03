package jp.co.f1.intro.ch9;

public class CreateArray {

	public static void main(String[] args) {

		//配列変数の宣言と要素の作成
		int [] kandaMansion;
		kandaMansion = new int [3];

		System.out.println("kandaMansionの値：" + kandaMansion);

		System.out.println("０号室の値：" + kandaMansion[0]);
		System.out.println("１号室の値：" + kandaMansion[1]);
		System.out.println("２号室の値：" + kandaMansion[2]);

	}

}
