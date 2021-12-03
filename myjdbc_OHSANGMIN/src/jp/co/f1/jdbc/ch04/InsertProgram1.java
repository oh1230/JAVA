package jp.co.f1.jdbc.ch04;

import java.util.ArrayList;

public class InsertProgram1 {

	private static ArrayList<String> isbnList = null;
	private static ArrayList<String> titleList = null;
	private static ArrayList<Integer> priceList = null;

	public static void main(String[] args) {

		try {

			SampleDAO1 objDao = new SampleDAO1();

			isbnList = objDao.selectIsbnAll();
			titleList = objDao.selectTitleAll();
			priceList = objDao.selectPriceAll();

			System.out.println("■登録SQL発行前の書籍一覧表示■");
			display();

			int rowsCount = objDao.insertBook("00008", "Strutsテキスト", 2000);
			if (rowsCount > 0) {
				System.out.println(rowsCount + "件のレコードを登録しました。\n");
			}

			isbnList = objDao.selectIsbnAll();
			titleList = objDao.selectTitleAll();
			priceList = objDao.selectPriceAll();

			System.out.println("■登録SQL発行後の書籍一覧表示■");
			display();

		} catch (Exception e) {
			System.out.println("エラーが発生しました。" + e);
		}
	}

	public static void display () {
		for (int i = 0; i < isbnList.size(); i++) {
			System.out.print("ISBN→"  + isbnList.get(i)  + "\t");
			System.out.print("Title→"  + titleList.get(i)  + "\t");
			System.out.print("Price→"  + priceList.get(i)  + "\n");
		}
		System.out.println();
	}

}
