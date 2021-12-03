package jp.co.f1.study.bms_db;

public class Book {
	//書籍番号を格納する変数
	private String isbn;

	//タイトルを格納する変数
	private String title;

	//価格を格納する変数
	private int price;

	//コンストラクタ定義
	public Book () {
		this.isbn = null;
		this.title = null;
		this.price = 0;
	}

	//isbn,title,priceのget,setメソッド
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
