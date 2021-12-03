package jp.co.f1.intro.ch10exercise;

public class Practice1005 {

	static double searchMaximum (double[] arry) {
		double maxNum = arry[0];

		for (int i = 1; i < arry.length; i++) {
			if (maxNum < arry[i]) {
				maxNum = arry[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {

		System.out.println(" -- ランダムに生成された10個の数値 -- ");

		double[] ary = new double[10];

		for (int i = 0; i < 10; i++) {
			ary[i] = Math.random();
			System.out.println(ary[i]);
		}

		System.out.println(" -- 最大値 -- ");
		System.out.println(searchMaximum(ary));
	}

}
