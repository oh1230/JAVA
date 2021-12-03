package jp.co.f1.condition.test01;

import java.util.Scanner;

public class ConditionTest01_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("キーボードから数値を入力してください＞");
		int x = sc.nextInt();

		if(x > 0) {
			System.out.println("「" + x + "」 は正の数です。");
		} else if(x < 0) {
			System.out.println("「" + x + "」 は負の数です。");
		} else {
			System.out.println("「" + x + "」 はどちらでもありません。");
		}

	}

}
