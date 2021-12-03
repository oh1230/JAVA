package jp.co.f1.study.bms_file;

public class BmsFileTester {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {

		try {

			// BmsFunctionFileのオブジェクトを生成
			BmsFunctionFile bms = new BmsFunctionFile();

			while (true) {
				bms.displayMenu();
				int menuNum = bms.selectFunctionFromMenu();

				if (menuNum == 9) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("→" + e + "という例外が発生しました。");
		}

	}

}
