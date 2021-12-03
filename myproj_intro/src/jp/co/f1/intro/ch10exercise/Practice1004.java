package jp.co.f1.intro.ch10exercise;

public class Practice1004 {

	static void reverse (int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		System.out.println(" -- 変更前の配列 -- ");
		int [] ary = { 1, 3, 5, 7 };

		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}

		System.out.println(" -- 変更後の配列 -- ");
		reverse (ary);

	}

}
