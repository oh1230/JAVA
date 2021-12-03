package jp.co.f1.intro.ch6exercise;

import java.util.Scanner;

public class Practice0603 {

	public static void main(String[] args) {

		Scanner sin = new Scanner(System.in);
		System.out.print("成績を入力(1～5)-->");
		int grade = sin.nextInt();

		switch (grade) {
		case 1 :
			System.out.print("もっと頑張りましょう！");
			break;
		case 2 :
			System.out.print("もう少し努力が必要です。");
			break;
		case 3 :
			System.out.println("さらに良い成績を目指しましょう。");
			break;
		case 4 :
			System.out.print("良い成績です。");
			break;
		case 5 :
			System.out.println("最高の成績です。");
			break;
		default :
			System.out.println("1～5 の数値を入力して下さい！");
			break;
		}

	}

}
