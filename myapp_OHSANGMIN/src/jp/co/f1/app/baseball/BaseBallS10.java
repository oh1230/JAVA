package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS10 {

	private int randomArray[] = new int [3];
	private int playerArray[] = new int [3];

	//正解数字と予想数字の配列の各要素を0で初期化するコンストラクタ
	public BaseBallS10 () {
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = 0;
			playerArray[i] = 0;
		}
	}

	//0から9までのランダム値を3つ生成し正解数字用の配列の各要素に格納するメソッド
	private void createRandomNumber () {
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 10);
		}
		System.out.println("3桁のランダム数字（正解数字）は" + randomArray[0] + randomArray[1] + randomArray[2] + "です。");
	}

	//引数で受け取ったint型配列の各要素に格納された値がユニークか重複しているかをチェックするメソッド
	private boolean isUniqueArray (int[] tmpArray) {
		if (tmpArray[0] == tmpArray [1] || tmpArray[1] == tmpArray[2] || tmpArray[0] == tmpArray[2]) {
			return false;
		} else {
			return true;
		}
	}

	//正解数字がユニークになるまでに繰り返す処理を行うメソッド
	private void createUniqueRandomNumber () {
		while (true) {
			createRandomNumber();
			if (isUniqueArray(randomArray)) {
				System.out.println("⇒ユニークです。\n");
				break;
			}
			System.out.println("⇒重複しています。\n");
		}
	}

	//3桁のユニークな予想数字を入力するメソッド
	private void createUniquePlayerNumber () {
		Scanner sc = new Scanner(System.in);
		String inputNum;

		while (true) {
			System.out.print("3桁の数字を入力してください＞＞");
			inputNum = sc.nextLine();

			if (inputNum.equals("")) {
				System.out.println("何も入力されていません。ユニークな3桁の数字を入力してください。\n");
				continue;
			}

			try {
				Integer.parseInt(inputNum);
			} catch (NumberFormatException e) {
				System.out.println("文字が入力されました。ユニークな3桁の数字を入力してください。\n");
				continue;
			}

			if (inputNum.length() != 3) {
				System.out.println("3桁の数字ではありません。ユニークな3桁の数字を入力してください。\n");
				continue;
			}

			playerArray[0] = Integer.parseInt(inputNum.substring(0, 1));
			playerArray[1] = Integer.parseInt(inputNum.substring(1, 2));
			playerArray[2] = Integer.parseInt(inputNum.substring(2));

			if (isUniqueArray(playerArray)) {
				System.out.println("⇒ユニークです。\n");
				break;
			} else {
				System.out.println("⇒重複しています。\n");
			}

		}
	}

	//正解数字と予想数字の配列を比較し、ストライクの数をカウントするメソッド
	private int countNumberOfStrikes () {
		int strikeCount = 0;
		for (int i = 0; i < randomArray.length; i++) {
			if (playerArray[i] == randomArray[i]) {
				strikeCount++;
			}
		}
		return strikeCount;
	}

	//正解数字と予想数字の配列を比較し、ボールの数をカウントするメソッド
	private int countNumberOfBalls () {
		int ballCount = 0;
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				if (i != j && playerArray[i] == randomArray[j]) {
					ballCount++;
				}
			}
		}
		return ballCount;
	}

	//野球ゲーム全体の動作を管理するメソッド
	public void playBaseBallGame () {

		System.out.println("---野球ゲームプログラム開始---\n");

		//ユニークな正解数字の生成
		createUniqueRandomNumber();

		//トライ回数を格納する変数
		int numberOfTry = 0;

		while (true) {

			//ユニークな予想数字の生成
			createUniquePlayerNumber();

			//ストライク数のカウント
			int numberOfStrikes = countNumberOfStrikes();

			//ボール数のカウント
			int numberOfBalls = countNumberOfBalls();

			//ストライク・ボール数の表示
			System.out.println("判定：" + numberOfStrikes + "ストライク、" + numberOfBalls + "ボールです。\n");

			//トライ回数のカウント
			numberOfTry ++;

			//ゲームの終了判定
			if(numberOfStrikes == 3) {
				break;
			}
		}

		//終了メッセージの表示
		System.out.println(numberOfTry + "回トライし、3桁数字を当てました。 You Win!!\n");

		System.out.println("---野球ゲームプログラム終了---");

	}

}
