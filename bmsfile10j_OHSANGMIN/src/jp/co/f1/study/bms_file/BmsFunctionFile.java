package jp.co.f1.study.bms_file;

import java.util.ArrayList;

import jp.co.f1.study.common.FileIn;
import jp.co.f1.study.common.FileOut;
import jp.co.f1.study.common.KeyIn;

public class BmsFunctionFile {

	// データ分割用定数
	private final static String STR_COMMA = ",";

	// 書籍データファイルのパス
	private final static String FILENAME = "file\\bmsFileDB.csv";

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
			System.out.println("selectFunctionFromMenuメソッドの中で「2. 削除」が選択されました。\n");
			break;
		case 3:
			System.out.println("selectFunctionFromMenuメソッドの中で「3. 変更」が選択されました。\n");
			break;
		case 4:
			listFunction();
			break;
		case 9:
			System.out.println("＊＊処理を終了しました＊＊");
			break;
		default :
			System.out.println("Menu番号の数値を入力してください。\n");
		}
		return menuNum;
	}

	// 書籍データを読み込み各ArrayListオブジェクトに格納するインスタンスメソッド
	public void loadIntoMemoryFromFile() {

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

	//各ArrayListオブジェクトに格納された書籍情報を、コンソール画面に表示
	public void bookListDisplay () {
		System.out.println("\n＊＊＊書籍一覧＊＊＊");
		System.out.println("No. \t isbn \t title \t price");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");

		for (int i = 0; i < isbnArrayList.size(); i++) {
			System.out.println((i+1) + ".  \t" + isbnArrayList.get(i)
								+ " \t" + titleArrayList.get(i)
								+ " \t" + priceArrayList.get(i));
		}
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー\n");
	}

	//一覧機能を統括するインスタンスメソッド
	public void listFunction () {
		loadIntoMemoryFromFile();
		bookListDisplay();
	}

	//各ArrayListオブジェクトに格納された書籍データを書籍データファイルへ書き込むインスタンスメソッド
	public void writeIntoFileFromMemory () {
		//FileOutクラスを利用して書籍データファイルをオープン
		objOut.open(FILENAME);

		//FileOutクラスを利用してヘッダーデータ（isbn,title,price）の書き込む。
		objOut.writeln("isbn" + STR_COMMA + "title" + STR_COMMA + "price");
		//objOut.writeln("isbn, title, price");

		//FileOutクラスを利用して書籍データ全てを「ISBN,TITLE,PRICE」のカンマ区切り形式で書き込む。
		for (int i = 0; i < isbnArrayList.size(); i++) {
			objOut.writeln(isbnArrayList.get(i) + STR_COMMA +
						titleArrayList.get(i) + STR_COMMA +
						priceArrayList.get(i));
		}
		//FileOutクラスを利用して書籍データファイルをクローズ
		objOut.close();
	}

	public void addFunction () {
		String userInputIsbn;
		String userInputTitle;
		int userInputPrice;

		//最新の書籍データを読み込む
		loadIntoMemoryFromFile();

		System.out.println("\n＊＊＊書籍情報登録＊＊＊");

		//KeyInクラスを利用して書籍データ(ISBN、TITLE、PRICE)の入力処理
		System.out.println("ISBNを入力してください。");
		userInputIsbn = objKeyIn.readKey("【ISBN】 ⇒ ");
		userInputTitle = objKeyIn.readKey("【タイトル】 ⇒ ");
		userInputPrice = objKeyIn.readInt("【価格】 ⇒ ");

		//入力された書籍データを各ArrayListオブジェクトに格納
		isbnArrayList.add(userInputIsbn);
		titleArrayList.add(userInputTitle);
		priceArrayList.add(userInputPrice);

		//全書籍データを書籍データファイルに書き込む
		writeIntoFileFromMemory();

		//追加した書籍データをコンソール画面に表示
		System.out.println("\n＊＊＊登録済書籍情報＊＊＊");
		System.out.println("isbn \t title \t price");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		System.out.println(userInputIsbn + "\t" + userInputTitle + "\t" + userInputPrice);
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
	}

}
