package jp.co.f1.condition.test01;

import java.util.Scanner;

public class ConditionTest01_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("キーボードから数値を入力してください＞");
		int x = sc.nextInt();

		if(x % 2 == 0) {
			System.out.println("「" + x + "」 は偶数です。");
		} else {
			System.out.println("「" + x + "」 は奇数です。");
		}

	}

}
