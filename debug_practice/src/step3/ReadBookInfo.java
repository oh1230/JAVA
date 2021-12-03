package step3;

import java.util.ArrayList;

class Book {

	private String isbn;	// isbn
	private String title;	// タイトル
	private int price;		// 価格

	public Book() {
		isbn  = null;
		title = null;
		price = 0;
	}

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


public class ReadBookInfo {

	public static void main(String[] args){

		//書籍を格納する配列を宣言
		ArrayList<Book> bookList = new ArrayList<Book>();

		try{
			FileIn in = new FileIn();

			//ファイルのオープン
			in.open("src\\step3\\bookData.csv");

			String[] strArray = null;
			String strLine = null;

			//ファイルの読み取り開始
			while((strLine = in.readLine()) != null){

				Book book = new Book();
				strArray = strLine.split(",");

				book.setIsbn(strArray[0]);
				book.setTitle(strArray[1]);
				book.setPrice(Integer.parseInt(strArray[2]));

				bookList.add(book);

			}

			//ファイルのクローズ
			in.close();

			//読み込んだ書籍情報をコンソール画面に出力
			System.out.println("以下の書籍情報が読み込まれました！");
			for(Book book : bookList){
				System.out.println("ISBN:"+book.getIsbn()+"\t TITLE:"+book.getTitle()+"\t 価格:"+book.getPrice()+"円");
			}


		}catch(Exception e){
			System.out.println("エラーが発生しました！");
		}
	}
}
