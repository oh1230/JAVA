package jp.co.f1.jdbc.ch04;

public class SampleDTO {

	private String isbn;
	private String title;
	private int price;

	public SampleDTO () {
		isbn = null;
		title = null;
		price = 0;
	}

	public String getIsbn () {
		return isbn;
	}

	public void setIsbn (String isbn) {
		this.isbn = isbn;
	}

	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice (int price) {
		this.price = price;
	}
}
