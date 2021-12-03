package jp.co.f1.study.common;

import java.io.*;

/*
 * 指定されたデータをテキストファイルへ書き込みます。
 */
public class FileOut {
	private BufferedWriter bw = null; // BufferedWriterクラス

	/* ファイルのオープンを行うメソッド */
	public boolean open(String fname) {
		boolean sts = true;
		try {
			// 書き込みファイルオープンに相当する処理
			bw = new BufferedWriter(new FileWriter(fname));
		} catch (IOException e) {
			sts = false;
		}
		return sts;
	}

	/* ファイルへのデータ書き込みを行うメソッド */
	public boolean writeln(String str) {
		boolean sts = true;
		try {
			bw.write(str); // 1行分のデータをファイル出力
			bw.newLine(); // 行区切り文字を出力
		} catch (IOException e) {
			sts = false;
		}
		return sts;
	}

	/* ファイルのクローズを行うメソッド */
	public boolean close(){
		boolean sts = true;
		try {
			bw.close(); // ファイルのクローズ
		} catch (IOException e) {
			sts = false;
		}
		return sts;
	}

}
