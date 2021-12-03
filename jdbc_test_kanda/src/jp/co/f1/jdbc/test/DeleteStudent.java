package jp.co.f1.jdbc.test;

import java.util.Scanner;

public class DeleteStudent {
	public static void main(String[] args) {

		StudentDAO objDao = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		System.out.print("削除するid＞");
		int id = sc.nextInt();

		int count = objDao.delete(id);
		if (count == 0) {
			System.out.println("\nid：" + id + "のデータは存在しませんでした。");
		} else {
			System.out.println("\nid：" + id + "を削除しました。");
		}
	}
}
