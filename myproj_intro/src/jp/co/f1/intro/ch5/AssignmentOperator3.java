package jp.co.f1.intro.ch5;

public class AssignmentOperator3 {

	public static void main(String[] args) {

		// 剰余用の値を管理する変数
		int surplus = 11;

		//「surplus」 を 「5」 で割った余りを、「surplus」 に代入
		surplus %= 5;

		System.out.print("surplus の値は、");
		System.out.println(surplus);

	}

}
