package jp.co.f1.intro.ch7;

public class VariableScope2 {

	public static void main(String[] args) {

		// 合計を管理するための変数sumを宣言し、0で初期化
		int sum = 0;

		// カウンタ変数の宣言
		int i;

		for (i = 0; i < 10; i++) {
			sum += i;
		}

		System.out.println("変数「i」の値は、" + i);
		System.out.println("変数「sum」の値は、" + sum);

	}

}
