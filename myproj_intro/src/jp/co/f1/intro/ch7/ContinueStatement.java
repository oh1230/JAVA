package jp.co.f1.intro.ch7;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		// 入力値を管理する変数の宣言
		 int num;
		// 合計を管理するための変数sumを宣言し、0で初期化
		 int sum = 0;

		 while (true) {

			 System.out.print("整数値を入力してください(終了したい場合は0を入力) >");

			 num = sc.nextInt();

			 if (num == 0) {
				 System.out.println("0が入力されたので、処理を終了します。");
				 break;
			 } else if (num < 0) {
				 System.out.println("マイナス値は合計されません。");
				 System.out.println();
				 continue;
			 }

			 sum += num;

			 System.out.println("入力値は" + num + "です。");
			 System.out.println("合計値は" + sum + "です。");
			 System.out.println();

		 }

	}

}
