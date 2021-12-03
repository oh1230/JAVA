package jp.co.f1.study.bms_file;

import java.util.ArrayList;

import jp.co.f1.study.common.FileIn;
import jp.co.f1.study.common.FileOut;
import jp.co.f1.study.common.KeyIn;
import jp.co.f1.study.common.MyFormat;

public class BmsFunctionFile {

	private final static String REPRESENT_FILENAME = "file\\bmsIniFile.csv";

	public void loadIntoMemoryFromFileInitially() {
		String strLine;
		String[] strArray;

		if (objFileIn.open(REPRESENT_FILENAME) == false) {
			System.out.println("初期化ファイルのオープンに失敗しました。処理を中断します。");
			System.exit(1);
		}

		while ((strLine = objFileIn.readLine()) != null) {

			strArray = strLine.split(",");

			if (strArray.length != 3) {
				System.out.println("不正なデータが存在します。データを修正した後で再度実行してください。");
				System.exit(2);
			}

			try {
				if (!strArray[0].equals("isbn")) {
					isbnArrayList.add(strArray[0]);
					titleArrayList.add(strArray[1]);
					priceArrayList.add(Integer.parseInt(strArray[2]));
				}
			} catch (NumberFormatException e) {
				System.out.println("価格に文字が含まれています。データを修正した後で再度実行してください。");
				System.exit(3);
			}

		}

		if (objFileIn.close() == false) {
			System.out.println("初期化ファイルのクローズに失敗しました。処理を中断します。");
			System.exit(1);
		}

		writeIntoFileFromMemory();

		System.out.println("初期データファイルからデータの読み込みを行いました。");

	}

	// 変更機能を統括するインスタンスメソッド
	public void updateFunction() {

		loadIntoMemoryFromFile();
		bookListDisplay();

		String oldIsbn = objKeyIn.readKey("変更したい書籍(ISBN)を選択してください⇒");

		int index;
		if ((index = isbnArrayList.indexOf(oldIsbn)) == -1) {
			System.out.println("入力ISBN:" + oldIsbn + "は存在しませんでした。メニュー画面に戻ります。");
		} else {
			index = isbnArrayList.indexOf(oldIsbn);

			// インデックス（添え字）を利用して、変更前の書籍情報（TITLE,PRICE）を取得する
			String oldTitle = titleArrayList.get(index);
			int oldPrice = priceArrayList.get(index);

			// KeyInクラスを利用して変更後の書籍データ(TITLE、PRICE)の入力処理を行う
			String newTitle = objKeyIn.readKey("タイトル【" + oldTitle + "】変更⇒");
			int newPrice = objKeyIn.readInt("価格【" + oldPrice + "】変更⇒");

			// ンデックス(添字)と入力された変更後データを利用して各ArrayListオブジェクト内の書籍データを変更
			titleArrayList.set(index, newTitle);
			priceArrayList.set(index, newPrice);

			writeIntoFileFromMemory();

			System.out.println("\n＊＊＊変更済書籍情報＊＊＊");
			System.out.println("下記のように書籍情報が更新されました。");
			System.out.println("isbn  \t  title  \t  price");
			System.out.println("ーーーーーーーーーーーーーーーーーーーーーーーーー");
			System.out.println(" \t変更前 \t\t 変更後");
			System.out.println("ISBN  \t " + oldIsbn + " →\t " + oldIsbn);
			System.out.println("TITLE  \t " + oldTitle + " →\t " + newTitle);
			System.out.println("PRICE  \t " + oldPrice + " →\t " + newPrice);
			System.out.println("ーーーーーーーーーーーーーーーーーーーーーーーーー\n");
		}
	}

	// 削除機能を統括するインスタンスメソッド
	public void deleteFunction() {

		// 最新の書籍データを読み込む
		loadIntoMemoryFromFile();
		// 、書籍データの一覧をコンソール画面に表示する
		bookListDisplay();

		// 削除対象データを選択するためのISBNの入力処理を行う
		String deleteIsbn = objKeyIn.readKey("削除したい書籍(ISBN)を選択してください＝＞");

		int index;
		if ((index = isbnArrayList.indexOf(deleteIsbn)) == -1) {
			System.out.println("入力ISBN:" + deleteIsbn + "は存在しませんでした。メニュー画面に戻ります。");
		} else {
			// 選択されたISBNの書籍データ(ISBN、TITLE、PRICE)をコンソール画面に表示
			index = isbnArrayList.indexOf(deleteIsbn);

			System.out.println("\n＊＊＊削除対象書籍情報＊＊＊");
			System.out.println("No. \t isbn \t title \t price");
			System.out.println("ーーーーーーーーーーーーーーーーーーーーーーー");
			System.out.println("\t\t " + deleteIsbn + " \t " + titleArrayList.get(index) + " \t "
					+ priceArrayList.get(index));
			System.out.println("ーーーーーーーーーーーーーーーーーーーーーーー");

			// KeyInクラスを利用して削除確認の入力処理を行う
			String strAns = objKeyIn.readKey("上記書籍を削除しますか＜y/n＞？");

			// 削除確認時に入力されたデータの処理
			if (strAns.equals("y")) {
				isbnArrayList.remove(index);
				titleArrayList.remove(index);
				priceArrayList.remove(index);

				writeIntoFileFromMemory();

				System.out.println("ISBN：" + deleteIsbn + "の書籍が削除されました。\n");
			} else {
				System.out.println("削除は行わず、メニュー画面に戻ります。\n");
			}

		}

	}

	// データ分割用定数
	private final static String STR_COMMA = ",";

	// 書籍データファイルのパス
	private final static String FILENAME = "file\\bmsIniFile.csv";

	// 書籍データを格納するArrayListオブジェクト
	private ArrayList<String> isbnArrayList = new ArrayList<String>();
	private ArrayList<String> titleArrayList = new ArrayList<String>();
	private ArrayList<Integer> priceArrayList = new ArrayList<Integer>();

	// 提供ライブラリのオブジェクト(フィールド変数)
	private FileIn objFileIn = new FileIn();

	// 提供ライブラリのオブジェクト(フィールド変数)
	private KeyIn objKeyIn = new KeyIn();

	// 提供ライブラリのオブジェクト(フィールド変数)
	private FileOut objOut = new FileOut();

	// メニュー画面を表示するインスタンスメソッド
	public void displayMenu() {
		System.out.println("＊＊＊書籍管理MENU＊＊＊");
		System.out.println("1．登録");
		System.out.println("2．削除");
		System.out.println("3．変更");
		System.out.println("4．一覧");
		System.out.println("9．終了");
		System.out.println("ーーーーーーーーーーーーーーーーーーー");
	}

	// メニュー番号を選択し、該当する機能を呼び出すインスタンスメソッド
	public int selectFunctionFromMenu() {
		int menuNum = objKeyIn.readInt("番号を選択してください＝＞");

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
			System.out.println("＊＊処理を終了しました＊＊");
			break;
		default:
			System.out.println("Menu番号の数値を入力してください。\n");
		}
		return menuNum;
	}

	// 書籍データを読み込み各ArrayListオブジェクトに格納するインスタンスメソッド
	public void loadIntoMemoryFromFile() {

		if (isbnArrayList.size() == 0) {
			System.out.println("\n読み込んだ書籍データが0件です。");
			loadIntoMemoryFromFileInitially();
		}

		String strLine;
		String[] strArray;

		// 書籍データを格納する各ArrayListオブジェクト内のデータを初期化
		isbnArrayList.clear();
		titleArrayList.clear();
		priceArrayList.clear();

		// FileInクラスを利用して書籍データファイルをオープン
		objFileIn.open(FILENAME);

		// FileInクラスを利用して書籍データファイルから書籍データを読み込む
		strLine = objFileIn.readLine();

		// 読み込み可能なデータがなくなるまで処理を繰り返す
		while ((strLine = objFileIn.readLine()) != null) {

			// splitメソッドを利用して、読み込んだ書籍データを,(カンマ)で分割した配列データを受け取る
			strArray = strLine.split(STR_COMMA);

			// ヘッダーデータではない場合には各ArrayListオブジェクトに格納
			if (!strArray[0].equals("isbn")) {
				isbnArrayList.add(strArray[0]);
				titleArrayList.add(strArray[1]);
				priceArrayList.add(Integer.parseInt(strArray[2]));
			}
		}

		objFileIn.close();
	}

	// 各ArrayListオブジェクトに格納された書籍情報を、コンソール画面に表示
	public void bookListDisplay() {
		System.out.println("\n＊＊＊書籍一覧＊＊＊");
		System.out.println("No. \t isbn \t title \t price");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");

		MyFormat objMyForm = new MyFormat();

		for (int i = 0; i < isbnArrayList.size(); i++) {
			System.out.print((i + 1) + ".  \t " + isbnArrayList.get(i) + " \t " + titleArrayList.get(i)
					+ " \t ");
			System.out.println(objMyForm.moneyFormat(priceArrayList.get(i)));
		}
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー\n");
	}

	// 一覧機能を統括するインスタンスメソッド
	public void listFunction() {
		loadIntoMemoryFromFile();
		bookListDisplay();
	}

	// 各ArrayListオブジェクトに格納された書籍データを書籍データファイルへ書き込むインスタンスメソッド
	public void writeIntoFileFromMemory() {

		// FileOutクラスを利用して書籍データファイルをオープン
		objOut.open(FILENAME);

		// FileOutクラスを利用してヘッダーデータ（isbn,title,price）の書き込む。
		objOut.writeln("isbn" + STR_COMMA + "title" + STR_COMMA + "price");
		// objOut.writeln("isbn, title, price");

		// FileOutクラスを利用して書籍データ全てを「ISBN,TITLE,PRICE」のカンマ区切り形式で書き込む。
		for (int i = 0; i < isbnArrayList.size(); i++) {
			objOut.writeln(isbnArrayList.get(i) + STR_COMMA + titleArrayList.get(i) + STR_COMMA
					+ priceArrayList.get(i));
		}

		// FileOutクラスを利用して書籍データファイルをクローズ
		objOut.close();
	}

	public void addFunction() {
		String userInputIsbn;
		String userInputTitle;
		int userInputPrice;

		// 最新の書籍データを読み込む
		loadIntoMemoryFromFile();

		System.out.println("\n＊＊＊書籍情報登録＊＊＊");

		// KeyInクラスを利用して書籍データ(ISBN、TITLE、PRICE)の入力処理
		System.out.println("ISBNを入力してください。");
		userInputIsbn = objKeyIn.readKey("【ISBN】 ⇒ ");
		userInputTitle = objKeyIn.readKey("【タイトル】 ⇒ ");
		userInputPrice = objKeyIn.readInt("【価格】 ⇒ ");

		// 入力された書籍データを各ArrayListオブジェクトに格納
		isbnArrayList.add(userInputIsbn);
		titleArrayList.add(userInputTitle);
		priceArrayList.add(userInputPrice);

		// 全書籍データを書籍データファイルに書き込む
		writeIntoFileFromMemory();

		// 追加した書籍データをコンソール画面に表示
		System.out.println("\n＊＊＊登録済書籍情報＊＊＊");
		System.out.println("isbn  \t  title  \t  price");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		System.out.println(userInputIsbn + " \t " + userInputTitle + " \t " + userInputPrice);
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");

	}

}
