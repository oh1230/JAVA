package jp.co.f1.app.baseball;

public class BaseBallS10Tester {

	public static void main(String[] args) {

		try {
			BaseBallS10 baseball = new BaseBallS10();
			baseball.playBaseBallGame();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列のエラーが発生しました。");
		} catch (Exception e) {
			System.out.println("→" + e + "という例外が発生しました。");
		}
	}
}
