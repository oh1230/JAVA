/*
 * プログラム名： 書籍管理システムDB版 Ver1.0
 * プログラムの説明：書籍情報をMうSQLデータベースで管理するシステム
 * 作成者：オ　サンミン
 * 作成日付：2021/10/27
 */

package jp.co.f1.study.bms_db;

public class BmsDBTester {

	public static void main(String[] args) {
		try {
			// BmsFunctionDBをオブジェクト化
			BmsFunctionDB bms = new BmsFunctionDB();
			// int型変数menuNumを宣言し、０で初期化
			int menuNum = 0;

			// 特定条件を満たさないかぎりループを繰り返す
			while (true) {
				// BmsFunctionDBのdisplayMenuメソッドを実行
				bms.displayMenu();
				// BmsFunctionDBのselectFunctionFromMenuを実行、return値をmenuNumに代入
				menuNum = bms.selectFunctionFromMenu();
				// menuNum値が９ならループを出て終了
				if (menuNum == 9) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("→" + e + "という例外が発生しました。");
		}
	}
}
