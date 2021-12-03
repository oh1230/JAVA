package jp.co.f1.intro.ch9;

public class ForLoopWithArray {

	public static void main(String[] args) {

		//　配列変数の宣言と要素の作成
		int [] intArray = new int [3];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = 100;
			System.out.println("intArray[" + i + "]の値：" + intArray[i]);
		}

	}

}
