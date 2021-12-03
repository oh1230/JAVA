package jp.co.f1.superintro.test;

public class CountCoin {

	public static void main(String[] args) {

		System.out.println("ゲーム開始！");
		int count = 1; //int型変数count宣言と同時に１で初期化

		while (true) {
			int coin = (int)(Math.random()*2); // int型変数宣言と同時に０～１のランダムな数で初期化

			if (coin == 1) {
				System.out.println("コイントスの結果 「裏」 が出ました。");
			} else {
				System.out.println("コイントスの結果 「表」 が出ました。");
				System.out.println(count + "回目のコイントスで終わりました。");
				break; //繰り返し文から出る
			}
			count++; //回数を数える
		}

	}

}
