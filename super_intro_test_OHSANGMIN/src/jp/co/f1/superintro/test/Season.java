package jp.co.f1.superintro.test;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //キーボード入力メソッド

		System.out.print("1から12のうち、好きな月を1つ入力しなさい・・＞");
		int month = sc.nextInt(); //変数宣言と入力した値で初期化

		if (month == 3) {
			System.out.println("春です。");
		} else if (month == 6) {
			System.out.println("夏です。");
		}  else if (month == 9) {
			System.out.println("秋です。");
		}  else if (month == 12) {
			System.out.println("冬です。");
		}  else {
			System.out.println("季節未設定です。");
		}

	}

}
