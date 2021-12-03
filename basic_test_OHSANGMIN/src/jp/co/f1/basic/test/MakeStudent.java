package jp.co.f1.basic.test;

public class MakeStudent {

	public static void main(String[] args) {

		//オブジェクト変数s1Obj を宣言し、Student クラスのオブジェクトを生成する。（引数に”田中”を設定）
		Student s1Obj = new Student("田中");

		//s1Obj のplusCount メソッドを呼び出す。
		s1Obj.plusCount();

		//s1Obj の属性値（name）を表示。
		System.out.println("名前：" + s1Obj.getName());

		//Student クラスのshowCount メソッドを呼び出す。
		Student.showCount();

		//オブジェクト変数s2Obj を宣言し、s1Obj を代入する。
		Student s2Obj = s1Obj;

		//s2Obj のplusCount メソッドを呼び出す。
		s2Obj.plusCount();

		//s1Obj のname に”山田”を設定する。
		s1Obj.setName("山田");

		//s2Obj の属性値（name）を表示。
		System.out.println("名前：" + s2Obj.getName());

		//Student クラスのshowCount メソッドを呼び出す。
		Student.showCount();

	}

}
