/*
 * プログラム名　：　myapp_super_intro_OHSANGMIN
 * プログラム説明　：　BMIプログラムのSTEP1として身長と体重を画面に表示する
 * 作成者　：　オ　サン　ミン
 * 作成日　：　2021年10月5日
 */

package jp.co.f1.app.bmi;

public class BmiStep1 {

	public static void main(String[] args) {

		// プログラム開始メッセージ
		System.out.println("※※BMI計算プログラムを開始します※※");
		System.out.println();

		//身長と体重の変数を入力
		double tall = 170.0;
		double weight = 56.0;

		//身長を入力
		System.out.print("身長が　");
		System.out.print(tall);
		System.out.print("cm、　");

		//体重を入力
		System.out.print("体重が　");
		System.out.print(weight);
		System.out.println("ｋｇ");

		System.out.println();

		System.out.print("※※BMI計算プログラムを終了します※※");

	}

}
