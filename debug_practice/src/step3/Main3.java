package step3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main3 {

	/**
	 * 引数で与えられた数値が正規表現（数値）かどうかを判定するメソッド
	 * @param inputStr : チェック対象の文字列
	 * @return 正規表現であればtrue、正規表現でなければfalseを返す。
	 */
	private static boolean isMatchNumber(String inputStr){

        return Pattern.compile("^-?[0-9]+$").matcher(inputStr).find();
	}

	/**
	 * コンソール画面に入力された数字を取得するメソッド
	 * @return 入力された数値
	 */
	private static long inputNumber(){

		Scanner sc = new Scanner(System.in);
		String inputNum = "";

		do{
			System.out.print("数値を入力して下さい。:");

			inputNum = sc.next();

			if(isMatchNumber(inputNum)){
				break;
			}else{
				System.out.println("文字が混じっています！");
			}
		}while(true);

		return Long.parseLong(inputNum);
	}

	/**
	 * 引数で与えられた数字の中の0～9までの個数をそれぞれカウントするメソッド
	 * @param targetNum : カウント対象の数字
	 * @param numCountArray : 各数字の個数を格納する配列
	 */
	private static void countNumber(long targetNum,int[] numCountArray){
		while(targetNum != 0){
			numCountArray[(int)(targetNum % 10)]++;
			targetNum = targetNum / 10;
		}
	}

	public static void main(String[] args){

		int[] numCountArray = new int[10];

		//数値の入力
		long targetNum = inputNumber();

		//入力された数字にある0から9までの各数字を数える
		countNumber(targetNum,numCountArray);

		//0から9までの各数字の個数を出力する
		for(int i=0;i<numCountArray.length;i++){
			System.out.println(i+"は"+numCountArray[i]+"個あります。");
		}


	}
}