package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList7 {

	public static void main(String[] args) {

		int index;

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");

		System.out.println("■変更前のデータ一覧");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}

		System.out.println("----------------------------------------");
		index = strList.indexOf("Hello");

		if (index != -1) {
			System.out.println("Helloは要素番号「" + index + "」に格納されています。");
		} else {
			System.out.println("Helloは見つかりませんでした。");
		}

		strList.set(2, "Good Bye!");
		strList.remove(1);

		System.out.println("\n■変更後のデータ一覧");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}

		System.out.println("----------------------------------------");
		index = strList.indexOf("Hello");

		if (index != -1) {
			System.out.println("Helloは要素番号「" + index + "」に格納されています。");
		} else {
			System.out.println("Helloは見つかりませんでした。");
		}

	}

}
