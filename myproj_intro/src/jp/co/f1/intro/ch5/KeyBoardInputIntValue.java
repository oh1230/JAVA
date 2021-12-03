package jp.co.f1.intro.ch5;

import java.util.Scanner;

public class KeyBoardInputIntValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("誕生月を入力して下さい＞");
		int birthMonth = sc.nextInt();
		System.out.print("あなたの誕生月は、" + birthMonth + "月です。");

	}

}
