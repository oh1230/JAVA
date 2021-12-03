package jp.co.f1.superintro.ch07;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//カウント変数
		int count = 0;

		System.out.println("**ループ開始**");
		while(true) {
			System.out.print("ループを続けるなら 「y」 を入力して下さい　＞　");
			String result = sc.nextLine();

			//入力判定
			if(result.equals("y")) {
				//カウントを１増やす
				count++;
				System.out.println(count + "回目のループです。");
				System.out.println();
			} else {
				System.out.println("y以外の" + result + "が入力されたので終了します。");
				break;
			}

		}
		System.out.println("**ループ終了**");

	}

}
