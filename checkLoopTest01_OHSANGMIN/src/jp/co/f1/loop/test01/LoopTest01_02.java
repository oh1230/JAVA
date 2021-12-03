package jp.co.f1.loop.test01;

import java.util.Scanner;

public class LoopTest01_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.print("キーボードから数値を入力してくださし　＞　");
		int num = sc.nextInt();

		int count = 0;
		while(count < num) {
			System.out.print("■ ");
			count++;
		}

	}

}
