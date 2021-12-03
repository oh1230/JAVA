package jp.co.f1.intro.ch10exercise;

import java.util.Scanner;

public class Practice1003 {

	static void dispLine (int star) {
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star; j++) {
				outSign();
			}
			System.out.println();
		}
	}

	static void outSign () {
		System.out.print("＊ ");
	}

	public static void main(String[] args) {

		Scanner sin = new Scanner(System.in);

		System.out.print("正方形の１辺を入力--＞");
		int hen = sin.nextInt();

		dispLine(hen);

	}

}
