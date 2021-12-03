package jp.co.f1.jdbc.test;

import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {

		StudentDAO objDao = new StudentDAO();
		Student objStu = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.print("sidを入力＞");
		int sid = sc.nextInt();
		System.out.print("nameを入力＞");
		String name = sc.next();
		System.out.print("idを入力＞");
		int id = sc.nextInt();
		System.out.print("scoreを入力＞");
		int score = sc.nextInt();

		objStu.setSid(sid);
		objStu.setName(name);
		objStu.setId(id);
		objStu.setScore(score);

		int count = objDao.insert(objStu);

		System.out.println("\n" + count + "件の登録が完了しました。");

	}
}
