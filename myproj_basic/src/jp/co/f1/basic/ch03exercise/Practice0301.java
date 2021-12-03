package jp.co.f1.basic.ch03exercise;

class Books3 {
	private String title;
	private int price;

	public void show() {
		System.out.println("この本のタイトルは" + this.title + "で、値段は" + this.price+ "です。");
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return this.price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setprice(int price) {
		if (price < 0) {
			this.price = 0;
			System.out.println("設定する値が" + price + "のため、価格は０を設定しました。");
		} else {
			this.price = price;
		}
	}

}

public class Practice0301 {
	public static void main(String[] args) {

		// Books3オブジェクト2つ生成
		Books3 book1 = new Books3();
		Books3 book2 = new Books3();

		// book1オブジェクトの値を設定と結果を表示
		book1.setTitle("Java 入門テキスト");
		book1.setprice(2580);
		book1.show();

		// book2オブジェクトの値を設定(価格は不正な値と結果を表示
		book2.setTitle("Java 基礎テキスト");
		book2.setprice(-3800);
		book2.show();

	}

}
