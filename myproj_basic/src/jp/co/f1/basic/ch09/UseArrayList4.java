package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList4 {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");

		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}

	}

}
