package jp.co.f1.loop.test01;

public class LoopTest01_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while(true) {
			int num = (int)(Math.random()*6)+1;

			System.out.println("サイコロの目　「" + num + "」");

			if(num == 6) {
				System.out.println("6が出たので終わりです。");
				break;
			}

		}

	}

}
