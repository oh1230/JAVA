package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList9 {

	public static void showArrayListData (ArrayList<String> tmpStrList) {
		for (int i = 0; i < tmpStrList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + tmpStrList.get(i) + "」です。");
		}
	}

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");

		System.out.println("■クリア前のデータ一覧");

		showArrayListData(strList);

		strList.clear();

		System.out.println("\n■クリア後のデータ一覧");
		if (strList.isEmpty()) {
			System.out.println("データは1件もありません");
		} else {
			showArrayListData(strList);
		}

	}

}
