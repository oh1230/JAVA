package jp.co.f1.intro.ch9exercise;

import java.util.Scanner;

public class Practice0903 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		double ave = 0.0;
		int [] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) +"番目の数値を入力--＞");
			score[i] = sc.nextInt();
			sum += score[i];
		}

		ave = (double)sum / score.length;

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊");

		System.out.println("合計 = " + sum);
		System.out.println("平均 = " + ave);


	}

}
