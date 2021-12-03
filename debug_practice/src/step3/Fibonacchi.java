package step3;

import java.util.Scanner;

public class Fibonacchi {

	/**
	 * 引数に与えらえたn番目のフィボナッチ数列を計算するメソッド
	 * @param n :
	 * @return : 計算結果
	 */
	private static long fibonacchi(int n){
		long f1 = 1;
		long f0 = 0;
		long f = -1;

		for(int i=1;i<=n;i++){
			f = f1 + f0;
			f0 = f1;
			f1 = f;
		}

		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;

		do{
			System.out.print("正の数字を入力して下さい:");
			inputNum = sc.nextInt();

			if(inputNum <= 0){
				System.out.println("正の数字ではありません！");
			}
		}while(inputNum <= 0);


		System.out.println("F["+inputNum+"]の値は"+fibonacchi(inputNum)+"です。");


	}

}
