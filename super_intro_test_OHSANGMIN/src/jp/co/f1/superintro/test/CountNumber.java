package jp.co.f1.superintro.test;

public class CountNumber {

	public static void main(String[] args) {

		System.out.println("1から10まで数えます。");
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.print(i); //iを出力
			if (i % 3 == 0) {
				System.out.print("!");//条件文で後ろに！をつける
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("数え終わりました！");

	}

}
