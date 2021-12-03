package step3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnswerPrime {

	/**
	 * コンソール画面に数値を入力するメソッド
	 * @param msg : コンソール画面に出力するメッセージ
	 * @return 入力値
	 */
	private static int inputNumber(String msg){
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;

		do{
			try{
				System.out.print(msg);
				inputNum = sc.nextInt();
			}catch(InputMismatchException ime){
				System.out.println("int型の数値を入力して下さい！");
				sc.next();
				continue;
			}

			if(inputNum <= 1){
				System.out.println("正の数字ではありません！");
			}
		}while(inputNum <= 1);

		return inputNum;
	}

	/**
	 * 引数で与えられた数字以下の素数を配列に格納するメソッド
	 * @param num : 入力された数字
	 * @return 素数のリスト
	 */
	private static ArrayList<Integer> setPrimeList(int num){

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		for(int i = 0; i<= num; i++){
			boolean isPrime = true;
            for(int j = 2; j < primeList.size(); j++){

            	if(Math.sqrt(i) < primeList.get(j)){
            		break;
            	}

                if(i % primeList.get(j) == 0){
                	isPrime = false;
                    break;
                }
            }
            if(isPrime) {
            	primeList.add(i);
            }
        }

		return primeList;
	}

	public static void main(String[] args) {

		//コンソール画面への入力
		int inputNum = inputNumber("1以上の値を入力して下さい:");

		//素数をリストに格納する
		ArrayList<Integer> list = setPrimeList(inputNum);
		System.out.println(inputNum+"以下の素数は"+list.size()+"個あります。\n");

		//コンソール画面への入力
		System.out.println(inputNum+"以下の数字の中で素数だと思う数値を入力して下さい:");
		while(true){

			//予想の値を入力
			int answerNum = inputNumber(">");

			if(answerNum > inputNum){
				System.out.println(inputNum+"以下の数字を入力して下さい！");
				continue;
			}

			//入力した値が素数であれば終了
			if(list.indexOf(answerNum) != -1){
				System.out.println("大当たりです！");
				break;
			}else{
				System.out.println("はずれです\n");
			}

		}

	}

}
