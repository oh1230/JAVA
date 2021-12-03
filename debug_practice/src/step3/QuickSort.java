package step3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort{

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

    /**
     * 引数で与えられた配列を並べ替えるメソッド
     * @param arr : 対象の配列
     */
    static void quickSort(int arr[]){
    	quickSort(arr, 0, arr.length-1);
    }


   /**
    * 引数で与えられた配列を並べ替えるメソッド
    * @param arr : 対象の配列
    * @param left : ソート対象の配列添字（左側）
    * @param right : ソート対象の配列添え字（右側）
    */
    static void quickSort(int[] arr, int left, int right){
        if (left <= right) {
            int p = arr[(left+right) / 2];
            int l = left;
            int r = right;

            while(l <= r) {
                while(arr[l] < p){ l++; }
                while(arr[r] > p){ r--; }

                if (l <= r) {
                    int tmp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = tmp;
                    l++;
                    r--;
                }
            }

            quickSort(arr, left, r);
            quickSort(arr, l, right);
        }
    }


   /**
    * 引数に与えられた配列を出力するメソッド
    * @param arr : 出力対象の配列
    */
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
    	try{

    		//昇順に並べ替えたい配列を定義
	        int[] targetArray = QuickSort.inputArray();

	        //配列をコンソール画面へ出力
	        System.out.print("ソート前：");
	        QuickSort.printArray(targetArray);

	        //配列の並べ替え
	        QuickSort.quickSort(targetArray);

	        //並べ替え後の配列をコンソール画面へ出力
	        System.out.print("ソート後：");
	        QuickSort.printArray(targetArray);

    	}catch(Exception ex){
    		System.out.println("例外が発生しました。");
    	}
    }
}