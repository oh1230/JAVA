/*
 * プログラム名：Step9：入力チェックとエラー処理を追加する
 * プログラムの説明：条件文や例外処理を利用して、
 * 					キーボードから入力した3桁の数字（予想数字）の入力チェックを行います。
					3桁数字以外のデータが入力された場合には
					エラーメッセージをコンソール画面に表示し、
					再入力を促します。
					入力チェックの他に、
					配列や想定外の例外処理もあわせて追加します。
					数と共にコンソール画面に表示します
 * 作成者：オ　サン　ミン
 * 作成日：2021/10/18
 */

package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS09 {

	//クラスメソッド
	private static boolean isUniqueArray (int[] tmpArray) {

		if (tmpArray[0] == tmpArray [1] || tmpArray[1] == tmpArray[2] || tmpArray[0] == tmpArray[2]) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//プログラム開始メッセージ
		System.out.println("---野球ゲームプログラム開始---\n");

		//ランダムな3つの数字を格納する配列変数「answer」を宣言
		int[] answer = new int[3];

		while (true) {
        		//Mathクラスのrandom()メソッドを利用して0から9までのランダムな数字を3つ生成
        		for (int i = 0; i < answer.length; i++) {
        			answer[i] = (int)(Math.random() * 10);
        		}

        		//配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
        		boolean unique = isUniqueArray(answer);
        		if (unique == true) {
        			System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");
        			System.out.println("⇒ユニークです。\n");
        			break;
        		} else {
        			continue;
        		}

		}

		//予想数字の配列playerNumを宣言(whileの外)
		int[] playerNum = new int[3];

		//count変数の宣言
		int tryCount = 0;

		//予想数字の入力
		while (true) {
			System.out.print("3桁の数字を入力してください。＞＞");
			String strNum = sc.nextLine();

			if (strNum.equals("")) {
				System.out.println("何も入力されていません。ユニークな3桁の数字を入力してください。\n");
			}

			if (strNum.length() != 3) {
				System.out.println("3桁の数字ではありません。ユニークな3桁の数字を入力してください。\n");
				continue;
			}

			try {
				Integer.parseInt(strNum);
			} catch (NumberFormatException e) {
				System.out.println("文字が入力されました。ユニークな3桁の数字を入力してください。\n");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("配列にエラーが発生しました。\n");
				continue;
			} catch (Exception e) {
				System.out.println(e + "という配列が発生しました。\n");
				continue;
			}

			//Stringクラスのsubstring()メソッドを利用して入力した数字を各桁ごとに分解し、配列変数「playerNum」の各要素に格納
			playerNum[0] = Integer.parseInt(strNum.substring(0, 1));
			playerNum[1] = Integer.parseInt(strNum.substring(1, 2));
			playerNum[2] = Integer.parseInt(strNum.substring(2, 3));

			//配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
    		boolean unique = isUniqueArray(playerNum);
    		if (unique == true) {
    			System.out.println("⇒ユニークです。\n");
    		} else {
    			System.out.println("⇒重複しています。\n");
    			continue;
    		}

			//正解数字の配列と予想数字の配列を比較して、ストライクの場合にカウントを行う処理を追加します。
			int strikeCount = 0;
			for (int i = 0; i < answer.length; i++) {
				if (answer[i] == playerNum[i]) {
					strikeCount++;
				}
			}
			//正解数字の配列と予想数字の配列を比較して、桁は異なるが数字が同じ場合にカウントを行う処理を追加
			int ballCount = 0;
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if (i != j && answer[i] == playerNum[j]) {
						ballCount++;
					}
				}
			}

        		//ストライク数をコンソール画面に表示
        		System.out.println("判定：" + strikeCount + "ストライク、" + ballCount + "ボールです。\n");

        		tryCount++;

        		//3ストライクの場合break;
        		if (strikeCount == 3) {
        			break;
        		}
		}

		System.out.println(tryCount + "回トライし、3桁数字を当てました。 You Win!!\n");

		//プログラム終了メッセージ
		System.out.println("---野球ゲームプログラム終了---");

	}

}
