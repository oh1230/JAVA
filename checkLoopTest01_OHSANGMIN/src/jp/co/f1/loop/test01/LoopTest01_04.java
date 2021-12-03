package jp.co.f1.loop.test01;

public class LoopTest01_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 10;

		System.out.println("変数 「num」 の値は 「" + num + "」");

		int count = 1;
		while(count <= num) {
			System.out.print(count);

			if(count <= 5) {
				System.out.print("★");
			}
			System.out.println();
			count++;
		}

	}

}
