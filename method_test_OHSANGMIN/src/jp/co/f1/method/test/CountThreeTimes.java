package jp.co.f1.method.test;

public class CountThreeTimes {

	public static int countThreeTimes (int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				printThreeTimesElement(i, array[i]);
				count++;
			}
		}
		return count;
	}

	public static void printThreeTimesElement (int index, int num) {

		System.out.println("配列番号 " + index + " 番目の値 " + num + " は 3 の倍数です。");

	}

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 7, 9, 11, 13, 15 };

		int count = countThreeTimes(array);

		System.out.println("\n配列内にある 3 の倍数は合計で " + count + " 個です。");

	}

}
