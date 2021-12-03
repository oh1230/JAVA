package jp.co.f1.condition.test01;

import java.util.Scanner;

public class ConditionTest01_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("年齢を入力してください＞");
		int x = sc.nextInt();

		if(x >= 0 && x <= 3) {
			System.out.println(x + "才は無料です。");
		} else if(x > 3 && x <= 11) {
			System.out.println(x + "才は子ども料金 (4,800円) です。");
		} else if(x > 11 && x <= 17) {
			System.out.println(x + "才は学生料金 (6,400円) です。");
		} else {
			System.out.println(x + "才は大人料金 (7,400円) です。");
		}


	}

}
