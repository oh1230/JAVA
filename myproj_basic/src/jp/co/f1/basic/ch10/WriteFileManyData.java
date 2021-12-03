package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileManyData {

	public static void main(String[] args) {

		String[] strArray = {
			"■世界の「ありがとう」",
			"日本語はありがとう",
			"韓国語はカムサハムニダ",
			"英語はサンキュー",
			"中国語はシェシェ",
			"ネパール語はダンニャバード",
			"ドイツ語はダンケ シェーン",
			"スペイン語はグラシァス",
			"フランス語はメルスィーボクー",
			"タイ語はコー（プ）クンマーグ",
			"ベトナム語はカム オンアウム",
			"ハワイ語はマハロ"
		};

		try {
			PrintWriter pw = new PrintWriter
				(new BufferedWriter (new FileWriter ("output2.txt")));

			for (int i = 0; i < strArray.length; i++) {
				pw.println(strArray[i]);
			}

			pw.close();
			System.out.println("ファイルに書き込みが終了");


		} catch (IOException e) {
			System.out.println(e+"入出力エラーです。");
		}

	}

}
