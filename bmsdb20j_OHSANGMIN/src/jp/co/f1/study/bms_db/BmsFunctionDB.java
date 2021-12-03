package jp.co.f1.study.bms_db;

import java.util.ArrayList;

import jp.co.f1.study.common.KeyIn;
import jp.co.f1.study.common.MyFormat;

public class BmsFunctionDB {
	// 書籍データを格納するArrayListオブジェクト化
	ArrayList<Book> bookList = new ArrayList<Book>();
	ArrayList<String> isbnList = new ArrayList<String>();

	// キーボード入力を担当するKeyInをオブジェクト化
	KeyIn objKeyIn = new KeyIn();

	// Databaseにデータの入出力機能だけを集めたBookDAOのオブジェクト化
	BookDAO objDao = new BookDAO();

	// 金を示す数値の前に「￥」を表示するMyFormatオブジェクト化
	MyFormat objformat = new MyFormat();

	// Bookクラスのオブジェクト化
	Book objBook = new Book();

	// メニューを見せるメソッド
	public void displayMenu() {
		System.out.println("＊＊＊書籍管理MENU＊＊＊");
		System.out.println("1．登録");
		System.out.println("2．削除");
		System.out.println("3．変更");
		System.out.println("4．一覧");
		System.out.println("9．終了");
		System.out.println("--------------------------------------------------");
	}

	// 番号を入力を受けて入力した番号によって違うメニューを実行
	public int selectFunctionFromMenu() {
		// KeyInクラス内のreadIntメソッドを利用して入力された番号をmenuNumに代入
		int menuNum = objKeyIn.readInt("番号を選択してください⇒");

		switch (menuNum) {
		case 1:
			addFunction();
			break;
		case 2:
			deleteFunction();
			break;
		case 3:
			updateFunction();
			break;
		case 4:
			listFunction();
			break;
		case 9:
			System.out.println("＊＊＊処理を終了しました＊＊＊");
			break;
		default:
			System.out.println("Menu番号の数値を入力してください。\n");
		}
		return menuNum;
	}

	// 書籍情報を見せる
	public void bookListDisplay () {
		System.out.println("＊＊＊書籍一覧＊＊＊");
		System.out.println("No. \t ISBN \t 書籍名 \t 価格");
		System.out.println("--------------------------------------------------");
		// bookList配列の中に入っている情報(ISBN,TITLE,PRICE)を並ぶ
		for (int i = 0; i < bookList.size(); i++) {
			Book objBook = bookList.get(i);
			System.out.print((i + 1) + ".  \t " + objBook.getIsbn() + " \t " + objBook.getTitle() + " \t ");
			System.out.println(objformat.moneyFormat(objBook.getPrice()));
		}
		System.out.println("--------------------------------------------------");
	}

	// 書籍情報を追加するメソッド
	public void addFunction() {
		System.out.println("\n＊＊＊書籍情報登録＊＊＊");

		while (true) {
			// KeyInクラス内のreadIntメソッドを利用して入力値をinputIsbn,inputTitle,inputPriceに代入
			String inputIsbn = objKeyIn.readKey("ISBNを入力してください。\n 【ISBN】⇒ ");

			isbnList = objDao.selectIsbn();
			int index = isbnList.indexOf(inputIsbn);
			if (inputIsbn.equals("")) {
				System.out.println("空文字が入力されました。ISBNを入力して下さい！\n");
				continue;
			} else if (index != -1) {
				System.out.println("入力ISBNは既に登録されています。:" + inputIsbn);
				continue;
			} else {
				String inputTitle = objKeyIn.readKey("タイトルを入力してください。\n 【タイトル】⇒ ");
				int inputPrice = objKeyIn.readInt("価格を入力してください。\n 【価格】⇒ ");

				// 上で入力した数値をBook(DTO)クラスに入れる
				objBook.setIsbn(inputIsbn);
				objBook.setTitle(inputTitle);
				objBook.setPrice(inputPrice);

				// データをBookDAOのinsertメソッドを利用してデータベースに入れる
				objDao.insert(objBook);

				// 今入力したデータの確認
				System.out.println("＊＊＊書籍済登録情報＊＊＊");
				System.out.println("ISBN \t 書籍名 \t 価格");
				System.out.println("--------------------------------------------------");
				System.out.print(objBook.getIsbn() + " \t " + objBook.getTitle() + " \t ");
				System.out.println(objformat.moneyFormat(objBook.getPrice()));
				System.out.println("--------------------------------------------------\n");

				// データの一覧
				listFunction();
				break;
			}
		}
	}

	public void deleteFunction() {
		listFunction();
		System.out.println("＊＊＊削除対象の書籍選択＊＊＊");
		String deleteIsbn = objKeyIn.readKey("削除したい書籍(ISBN)を選択してください＝＞");

		isbnList = objDao.selectIsbn();
		int index = isbnList.indexOf(deleteIsbn);
		if (index == -1) {
			System.out.println("入力ISBN:" + deleteIsbn + "は存在しませんでした。メニュー画面に戻ります。");
		} else {
			objBook = objDao.selectByIsbn(deleteIsbn);

			System.out.println("\n＊＊＊削除対象書籍情報＊＊＊");
			System.out.println("ISBN \t TITLE \t PRICE");
			System.out.println("--------------------------------------------------");
			System.out.print(objBook.getIsbn() + " \t " + objBook.getTitle() + " \t ");
			System.out.println(objformat.moneyFormat(objBook.getPrice()));
			System.out.println("--------------------------------------------------");

			// KeyInクラスを利用して削除確認の入力処理を行う
			String strAns = objKeyIn.readKey("上記書籍を削除しますか＜y/n＞？");

			// 削除確認時に入力されたデータの処理
			if (strAns.equals("y")) {
				objDao.delete(objBook);
				System.out.println("ISBN：" + deleteIsbn + "の書籍が削除されました。\n");
				listFunction();
			} else {
				System.out.println("削除は行わず、メニュー画面に戻ります。\n");
			}
		}
	}

	public void updateFunction() {
		listFunction();
		System.out.println("\n＊＊＊変更対象の書籍選択＊＊＊");
		String oldIsbn = objKeyIn.readKey("変更したい書籍(ISBN)を選択してください⇒ ");

		isbnList = objDao.selectIsbn();
		int index = isbnList.indexOf(oldIsbn);
		if (index == -1) {
			System.out.println("入力ISBN:" + oldIsbn + "は存在しませんでした。メニュー画面に戻ります。\n");
		} else {
			objBook = objDao.selectByIsbn(oldIsbn);
			String newTitle = objKeyIn.readKey("タイトル 【" + objBook.getTitle() + "】 変更⇒ ");
			int newPrice = objKeyIn.readInt("価格 【" + objBook.getPrice() + "】 変更⇒ ");

			System.out.println("\n＊＊＊更新済書籍情報＊＊＊");
			System.out.println("--------------------------------------------------");
			System.out.println("\t\t変更前 \t\t 変更後");
			System.out.println("ISBN \t" + oldIsbn + "\t→ \t" + oldIsbn);
			System.out.println("TITLE \t" + objBook.getTitle() + "\t→ \t" + newTitle);
			System.out.println("PRICE \t" + objBook.getPrice() + "\t→ \t" + newPrice);
			System.out.println("--------------------------------------------------\n");
			String strAns = objKeyIn.readKey("変更しますか＜y/n＞？");

			if (strAns.equals("y")) {
				objBook.setTitle(newTitle);
				objBook.setPrice(newPrice);
				objDao.update(objBook, oldIsbn);
			} else {
				System.out.println("変更は行わず、メニュー画面に戻ります。\n");
			}
		}

	}

	// データの一覧
	public void listFunction() {
		// BookDAOに有るselectAllメソッド実行、return値をbookListに代入
		bookList = objDao.selectAll();

		// コンソル画面に表示するメソッド
		bookListDisplay();
	}

}
