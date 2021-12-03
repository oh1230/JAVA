package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("Good morning");
		System.out.println("1つ目追加時の全データは" + strList + "です。");

		strList.add("Hello");
		System.out.println("2つ目追加時の全データは" + strList + "です。");

		strList.add("Bye");
		System.out.println("3つ目追加時の全データは" + strList + "です。");

	}

}
