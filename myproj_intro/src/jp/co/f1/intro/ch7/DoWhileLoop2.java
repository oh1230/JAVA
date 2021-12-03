package jp.co.f1.intro.ch7;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		// whileとdo-whileを制御するための変数
		int j = 6;

		System.out.println("-- 最初から条件に合わない場合（while文） --");

		while (j <= 5) {
			System.out.println("HelloDoWhileLoop!");
			j++;
		}

		System.out.println();
		System.out.println("-- 最初から条件に合わない場合（do-while文） --");

		do {
			System.out.println("HelloDoWhileLoop!");
			j++;
		} while (j <= 5);

	}

}
