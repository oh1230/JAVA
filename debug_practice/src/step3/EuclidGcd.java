package step3;

import java.util.Scanner;

public class EuclidGcd {

	private static final int N = 2;	//配列数

	/**
	 * コンソール画面から数字を入力し、入力した数字を配列に格納するメソッド
	 * @return コンソール画面に入力した数字のリスト
	 */
	static int[] inputNum(){

		int[] array = new int[N];
		Scanner sc = new Scanner(System.in);

		System.out.println("int型の整数を2つ入力してください。");
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "つ目を入力:" );
			array[i] = sc.nextInt();
		}

		return array;
	}


	/**
	 * ユークリッドの互換法を用いて2つの数字の最大公約数を出力するメソッド
	 * @param arr : 対象数字が格納されている配列
	 * @return 最大公約数
	 */
	static int gcd(int[] arr){
		return gcd(arr[0],arr[1]);
	}

	/**
	 * ユークリッドの互換法を用いて2つの数字の最大公約数を出力するメソッド
	 * @param num1 : 対象数字1
	 * @param num2 : 対象数字2
	 * @return num1とnum2の最大公約数
	 */
	static int gcd(int num1,int num2){

		if(num2 == 0){
			return num1;
		}else{

			int gcd = gcd(num2,(num1 % num2));

			return gcd;
		}

	}

	public static void main(String[] arg){

		//コンソール画面から2つの数字を入力
		int[] inputArray = EuclidGcd.inputNum();

		//最大公約数を求める
		int gcd = EuclidGcd.gcd(inputArray);

		//結果の出力
		System.out.println(inputArray[0]+"と"+inputArray[1]+"の最大公約数は"+gcd+"です。");
	}

}
