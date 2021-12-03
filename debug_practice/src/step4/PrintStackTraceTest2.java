package step4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintStackTraceTest2 {

	/**
	 * 配列を逆順にするメソッド
	 * @param array : 逆順に並べ替える対処の配列
	 */
	static void reverseArray(int[] array){
		reverseArray(array,array.length);
	}

	/**
	 * 配列を逆順にするメソッド（再帰呼び出しで使用）
	 * @param array : 逆順に並べ替える対象の配列
	 * @param p : 配列のポインタ
	 */
	private static void reverseArray(int[] array, int p) {

		if((array.length/2)<(array.length-p+1)){
			return;
		}
		int tmp = array[array.length-p];
		array[array.length-p] = array[p-1];
		array[p-1] = tmp;

		reverseArray(array,--p);
	}

	/**
	 * 配列をコンソール画面に表示するメソッド
	 * @param array : 表示対象の配列
	 */
	static void printArray(int[] array){
		for(int num: array){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	/**
	 * コンソール画面から数字を入力し、入力した数字を配列に格納するメソッド
	 * @return コンソール画面に入力した数字のリスト
	 */
	static int[] inputArray(){

		Scanner sc = new Scanner(System.in);

		System.out.print("配列数を設定します。: ");
		int length = sc.nextInt();

		int[] array = new int[length];

		System.out.println("\nint型の整数を"+length+"個入力してください。");
		int i = 0;
		while(i < length){
			try{
				System.out.print(i+"番目の数字を入力 : ");
				array[i] = sc.nextInt();
				i++;
			}catch(InputMismatchException ime){
				System.out.println("***数字を入力して下さい！もう一度入力します。***\n");
				sc.next();
			}
		}

		System.out.println("\n");

		return array;
	}

	public static void main(String[] args) {

		try{
			int[] array = inputArray();

			System.out.println("逆順ソート前");
			printArray(array);

			System.out.println("配列を逆順にします。");
			reverseArray(array);

			System.out.println("逆順ソート後");
			printArray(array);

			}catch(Exception e){
				e.printStackTrace();
				System.out.println("エラーが発生しました！");
			}
	}

}