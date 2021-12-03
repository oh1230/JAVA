package jp.co.f1.method.test;

public class Multiple2 {

	public static void multiple2 (int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}

	}

	public static void main(String[] args) {

		int[] array = { 7, 8, 9, 10, 11, 12 };

		multiple2(array);

		System.out.print("配列の要素は ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println(" です。");

	}

}
