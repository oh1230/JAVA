package jp.co.f1.basic.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowData {

	public static void main(String[] args) {

		try {
			Scanner sin = new Scanner(new File("Sample.txt"));

			String strLine1 = sin.nextLine();
			String strLine2 = sin.nextLine();

			System.out.println(strLine1);
			System.out.println(strLine2);

			sin.close();

		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません。");
		}

	}

}
