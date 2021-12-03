package jp.co.f1.intro.ch9;

public class TwoDimensionArrayWithKuku {

	public static void main(String[] args) {

		//　九九の答えを管理する為の2次元配列の宣言
		int [][] kuku = new int [9][9];

		for (int dan = 0; dan < 9; dan++) {
			for (int i = 0; i < 9; i++) {
				kuku[dan][i] = (dan + 1) * (i + 1);

			}
		}

		for (int dan = 0; dan < 9; dan++) {
			System.out.print((dan + 1) + "の段：");
			for (int i = 0; i < 9; i++) {
				System.out.print(kuku[dan][i] + "\t");
			}
			System.out.println();
		}

	}

}
