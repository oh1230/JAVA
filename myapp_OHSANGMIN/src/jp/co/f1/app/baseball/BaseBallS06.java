/*
 * プログラム名：野球ゲームプログラムStep6
 * プログラムの説明：3ストライクになるまで予想数字の入力を繰り返します。
				何回目で当てたかをカウントし
				ゲーム終了時にコンソール画面に表示します。
 * 作成者：オ　サン　ミン
 * 作成日：2021/10/13
 */

package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//プログラム開始メッセージ
		System.out.println("---野球ゲームプログラム開始---\n");

		//ランダムな3つの数字を格納する配列変数「answer」を宣言
		int[] answer = new int[3];

		while (true) {
        		//Mathクラスのrandom()メソッドを利用して0から9までのランダムな数字を3つ生成
        		for (int i = 0; i < answer.length; i++) {
        			answer[i] = (int)(Math.random()*10);
        		}

        		//配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
        		if (answer[0] == answer[1] || answer[0] == answer[2] || answer[1] == answer[2]) {
        			continue;
        		} else {
                		//配列変数「answer」の各要素に代入された数字をコンソール画面に表示
                		System.out.print("３桁のランダム数字（正解数字）は ");
                		for (int i = 0; i < answer.length; i++) {
                			System.out.print(answer[i]);
                		}
                		System.out.println("です。");
        			System.out.println("⇒ユニークです。\n");
        			break;
        		}
		}

		//予想数字の配列playerNumを宣言(whileの外)
		int[] playerNum = new int[3];

		//count変数の宣言
		int tryCount = 0;

		//予想数字の入力
		while (true) {
			System.out.print("3桁の数字を入力してください。＞＞");
			String num = sc.nextLine();

			//Stringクラスのsubstring()メソッドを利用して入力した数字を各桁ごとに分解し、配列変数「playerNum」の各要素に格納
			playerNum[0] = Integer.parseInt(num.substring(0, 1));
			playerNum[1] = Integer.parseInt(num.substring(1, 2));
			playerNum[2] = Integer.parseInt(num.substring(2, 3));

			//配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
        		if (playerNum[0] == playerNum[1] || playerNum[0] == playerNum[2] || playerNum[1] == playerNum[2]) {
        			System.out.println("⇒重複しています。\n");
        			continue;
        		} else {
        			System.out.println("⇒ユニークです。\n");
        		}

        		//正解数字の配列と予想数字の配列を比較して、ストライクの場合にカウントを行う処理を追加します。
        		int strikeCount = 0;
        		for (int i = 0; i < answer.length; i++) {
        			if (answer[i] == playerNum[i]) {
        				strikeCount++;
        			}
        		}

        		//ストライク数をコンソール画面に表示
        		System.out.println("判定：" + strikeCount + "ストライクです。\n");

        		tryCount++;

        		//3ストライクの場合break;
        		if (strikeCount == 3) {
        			break;
        		}
		}

		System.out.println(tryCount + "回トライし、3桁数字を当てました。 You Win!!");

		//プログラム終了メッセージ
		System.out.println("---野球ゲームプログラム開始---");

	}

}
