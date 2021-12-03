/*
 *プログラム名：Step7：正解数字のランダム化
 *プログラムの説明：JavaAPIのクラスに用意されたメソッドを利用して
 *					正解数字をランダムに生成します。
 *					プログラムを実行する度にコンソール画面に表示される
 *					正解数字が変更されます。
 *作成者：オ　サン　ミン
 *作成日：2021/10/18
 *
 */

package jp.co.f1.app.numberhit;

import java.util.*;

public class NumberHitS07 {

	public static void main(String[] args) {

		//正解数字代入
		int answerNum = (int)(Math.random()*10);

		//ゲーム開始メッセージ
		System.out.println("ゲーム開始（正解数字：" + answerNum + "）\n");

		while (true) {
			//例外が発生する可能性がある所
			try {
				//数字の入力
				System.out.print("　０から９までの予想の数字を入力＞＞");
				Scanner sc = new Scanner(System.in);
				int playerNum = sc.nextInt();

				 if (playerNum == 999) {
					System.out.println("　　→"+ playerNum +"が入力されたためゲームを終了します。");
					break;
				} else if (answerNum > playerNum && playerNum >= 0) {
					System.out.println("　　→正解数字は" + playerNum + "より大きいです。\n");
				} else if (answerNum < playerNum && playerNum < 10) {
					System.out.println("　　→正解数字は" + playerNum + "より小さいです。\n");
				}  else if (playerNum == 5) {
					System.out.println("　　→！！大当たり！！");
					break;
				} else {
					System.out.println("　　→エラー！！０から９の数字ではありません。\n");
				}
			} catch (InputMismatchException e) {//例外が発生した場合
				System.out.println("　　エラー！！文字が入力されました。\n");
				continue;
			}
		}

		//ゲーム終了メッセージ
		System.out.println("\nゲーム終了");

	}

}
