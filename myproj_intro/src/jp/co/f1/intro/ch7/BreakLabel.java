package jp.co.f1.intro.ch7;

public class BreakLabel {

	public static void main(String[] args) {

		myLabel : for (int i = 1; i <= 3; i++) {
			System.out.println("外側のループ" + i + "回目開始");

			for (int j = 1; j <= 5; j++) {
				System.out.println("    内側のループ" + j + "回目開始");
				if (j == 2) {
					System.out.println("        「ラベル付きbreak！」");
					break myLabel;
				}
				System.out.println("    内側のループ" + j + "回目終了");

			}
			System.out.println("外側のループ" + i + "回目終了");
			System.out.println();

		}
		System.out.println("プログラム終了");
	}

}
