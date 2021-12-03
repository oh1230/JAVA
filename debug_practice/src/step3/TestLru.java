package step3;

import java.util.Scanner;

class Lru {
	private String[] queueArray;	//値を格納するキュー
	private int rear;	//値が格納されている最後尾の添字番号

	Lru(int size){
		queueArray = new String[size];
		rear=0;
	}

	/**
	 * 値を配列の最後尾に格納するメソッド
	 * @param param : 格納する値
	 */
	public void enqueue(String param){

		int index = arrayIndexOf(param);
		if(index != -1){
			dequeue(index);
		}else if(rear == queueArray.length){
			dequeue(0);
		}

		queueArray[rear++] = param;
	}

	/**
	 * 配列内の値を削除するメソッド
	 * @param index : 削除対処の添字番号
	 */
	public void dequeue(int index){
		queueArray[index] = null;
		rear--;

		for(int i=index;i<rear;i++){
			queueArray[i] = queueArray[i+1];
		}
	}

	/**
	 * 引数で与えられた値が配列内にすでに格納されているかを確認するメソッド
	 * @param param : 検索対象の値
	 * @return 格納されていれば配列の添字番号、なければ-1
	 */
	private int arrayIndexOf(String param){
		for(int i=0;i<rear;i++){
			if(queueArray[i].equals(param)) return i;
		}

		return -1;
	}

	/**
	 * 配列内の値をコンソール画面に表示するメソッド
	 */
	public void printArray(){
		System.out.println("箱に入っている要素は以下になります。");
		for(int i=0;i<rear;i++){
			System.out.print("["+i+"] : "+queueArray[i]+" ");
		}
	}

}

public class TestLru {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);

		//箱の数を入力
		System.out.print("箱の数を入力します。>");
		Lru lru = new Lru(sc.nextInt());

		//配列に値を格納する
		System.out.println("箱に値を入れていきます。");
		System.out.println("箱に入れたい文字を入力して下さい。終了する場合は「end」を入力します。");
		while(true){

			//配列に格納したい値を入力
			System.out.print(">");
			String inputStr = sc.next();

			//endが入力されたら終了
			if(inputStr.equals("end")){
				break;
			}

			//配列への挿入処理
			lru.enqueue(inputStr);
		}

		//配列をコンソール画面に表示
		lru.printArray();
	}
}
