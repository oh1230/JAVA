package jp.co.f1.intro.ch10;

public class MethodWithArrayElement {

	static void checkPass( int point ) {
		if (point >= 50) {
			System.out.println(point + "点なので合格です。");
		} else {
			System.out.println(point + "点なので不合格です。");
		}
		System.out.println("　ー　ー　ー　");
	}

	public static void main(String[] args) {

		// String 型の名前を管理する配列の宣言と初期化
		String[] aryName = { "A君", "B君", "Cさん", "Dさん" };

		// int 型の点数を管理する配列の宣言と初期化
		int[] point = { 85, 32, 60, 40 };

		for (int i = 0; i < aryName.length; i++) {
			System.out.print(aryName[i] + "は、");
			checkPass(point[i]);
		}

	}

}
