package jp.co.f1.method.test01;

public class MethodTest01_05 {
	static void arrayTotal (int[] pointArray) {
		//total変数を宣言と同時に０で初期化
		int total = 0;
		//for文を利用して配列内の各要素の足し算
		for (int i = 0; i < pointArray.length; i++) {
			total += pointArray[i];
		}
		//合計値を出力
		System.out.println("合計値は " + total + " です。");
	}

	public static void main(String[] args) {

		//要素3つ分のint型配列
		int[] pointArray = new int[3];

		//各要素は10，20，30、で初期化
		pointArray[0] = 10;
		pointArray[1] = 20;
		pointArray[2] = 30;

		//配列pointArrayを引数にarrayTotalメソッドを呼び出す。
		arrayTotal(pointArray);

	}

}
