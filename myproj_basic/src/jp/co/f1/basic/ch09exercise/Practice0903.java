package jp.co.f1.basic.ch09exercise;

public class Practice0903 {

	public static void main(String[] args) {

		String[] title = { "Java 超入門", "Java入門", "Java基礎", "Java応用",  "Java超応用" };
		int[] price = {800, 1200, 1800, 2500, 3000};

		Books[] bookArray = new Books [5];

		for (int i = 0; i < bookArray.length; i++) {
			bookArray[i] = new Books (title[i], price[i]);
		}

		System.out.println("-------------------------------------------");

		for (int i = 0; i < bookArray.length; i++) {
			bookArray[i].showBookInfo();
		}

	}

}
