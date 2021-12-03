package jp.co.f1.superintro.ch05;

import java.util.Scanner;

public class KeyBoardInputStringValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力して下さい＞");
		String name = sc.nextLine();
		System.out.println("私の名前は、" + name + "です。");

	}

}
