package jp.co.f1.basic.ch09exercise;

public class Books {

	private String title;
	private int price;

	public Books(String title,int price){
		this.title = title;
		this.price = price;
	}

	public void setBookInfo(String title,int price) {
		this.title = title;
		this.price = price;
	}

	public void showBookInfo() {
		System.out.println("この本のタイトルは「" + this.title + "」です。");
		System.out.println("この本の価格は「" + this.price + "」円です。");
		System.out.println("-------------------------------------------");
	}

}
