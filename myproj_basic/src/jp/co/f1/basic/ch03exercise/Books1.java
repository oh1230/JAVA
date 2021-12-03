package jp.co.f1.basic.ch03exercise;

public class Books1 {
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
		this.price = price;
	}

}
