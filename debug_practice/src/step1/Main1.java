package step1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args){

		int[] yenType = {10000,5000,1000,500,100,50,10,5,1};	//日本円のお札または硬貨1枚の値段を格納する配列

		System.out.print("お金を入力して下さい。:");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		int[] countArray = new int[yenType.length];
		int i = 0;

		while(money > 0) {

			while(money < yenType[i]){
				i++;
			}

			money -= yenType[i];

			countArray[i]++;

		}

		System.out.println("");
		for(int j=0;j<countArray.length;j++){
			if(countArray[j]> 0){
				System.out.println(yenType[j]+"円が"+countArray[j]+"枚必要です。");
			}
		}


	}

}
