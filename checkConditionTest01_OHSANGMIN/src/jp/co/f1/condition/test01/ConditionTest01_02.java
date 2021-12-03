package jp.co.f1.condition.test01;

import java.util.Scanner;

public class ConditionTest01_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("キーボードから数値を入力してください＞");
		int x = sc.nextInt();

		if(x == 5) {
			System.out.println("入力された数値は 「5」 です。");
		} else {
			System.out.println("入力された数値は 「5」 ではありません。");
		}

	}

}
