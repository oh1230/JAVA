package jp.co.f1.intro.ch9;

public class TwoDimensionArrayInitializer {

	public static void main(String[] args) {

		//　int型の2次元配列の宣言と要素の初期化
		int [][] intArray = {
				{ 50, 150, 250 },
				{ 300, 200, 100 }
		};

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.println("intArray[" + i + "][" + j + "]の値：" + intArray[i][j]);
			}
			System.out.println();
		}

	}

}
