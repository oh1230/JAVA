package jp.co.f1.basic.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIn {

	private Scanner sin = null;

	public boolean open (String fname) {
		boolean sts = true;
		try {
			sin = new Scanner (new File (fname));
		} catch (FileNotFoundException e) {
			System.out.println("ファイル名に誤りがあります\n" + e);
			sts = false;
		}
		return sts;
	}

	public String readLine () {
		String buff;

		if (sin.hasNextLine()) {
			buff = sin.nextLine();
		} else {
			buff = null;
		}
		return buff;
	}

	public boolean close () {
		boolean sts = true;
		try {
			sin.close();
		} catch (Exception e) {
			System.out.println("ストリームクローズエラー\n" + e);
			sts = false;
		}
		return sts;
	}
}
