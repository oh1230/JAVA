package jp.co.f1.intro.ch6;

import java.util.Scanner;

public class SwitchNoBreak {

	public static void main(String[] args) {

		System.out.print("お好きな月を入力して下さい。>");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();

		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month + "月は春です。");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "月は夏です。");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "月は秋です。");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month + "月は冬です。");
			break;
		default :
			System.out.println("1～12 の月を入力して下さい。");
		}

	}

}
