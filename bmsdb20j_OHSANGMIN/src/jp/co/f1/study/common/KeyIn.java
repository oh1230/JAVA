package jp.co.f1.study.common;

/*
 * KeyIn.java 1.0 03/10/20
 * Copyright 2003 HCS. All rights reserved.
 */

import java.util.*;

/*
 * キーボードから入力されたデータを読み取ります。
 * 読み取り可能なデータは文字列(String型データ)、および整数(int型データ)です。
 */
public class KeyIn {
	private Scanner sin = new Scanner(System.in); // Scannerクラス

	/*
	 * 文字列を入力するメソッドです。
	 * 入力された文字列を返します。
	 * Enterのみが押下された場合は、""を返します。
	 * Ctrl+Zが入力された場合にはメッセージを表示し終了します。
	 */
	public String readKey() {
		String buff = null; // 入力バッファの初期化
		try {
			// 入力データの読み込み
			buff = sin.nextLine();
		} catch (NoSuchElementException e) { // Ctr+Zの入力エラー
			System.out.println("Ctr+Zが押されたので強制終了します。");
			System.exit(1);
		} catch (Exception e) { // キーボード入力の致命的エラー
			System.out.println(e);
			System.exit(1);
		}
		return buff; // 文字列を返却
	}

	/*
	 * 入力プロンプトを表示して文字列を入力するメソッドです。
	 * 入力された文字列を返します。
	 */
	public String readKey(String msg) {
		System.out.print(msg); // プロンプト表示
		return readKey(); // readKye()の呼び出し
	}

	/*
	 * 整数値を入力するメソッドです。
	 * 入力された整数値を返します。
	 * 整数値以外のデータが入力された場合や、
	 * int型の範囲を超えるデータが入力された場合は、
	 * "再入力>"プロンプトを表示して再入力を要求します。
	 * これは、正しく入力されるまで繰り返されます。
	 * また、Ctrl+Zが入力された場合にはメッセージを表示し終了します。
	 */
	public int readInt() {
		int buff; // 入力バッファの初期化
		String line = null;
		while (true) {
			try {
				line = readKey();
				buff = Integer.parseInt(line);  // 数値に変換
				break;                                  // ループ終了
			} catch (NumberFormatException e) {         // 数値変換のエラー
				System.out.println("整数値を入力してください:" + line);
				System.out.print("再入力>");
			}
		}
		return buff; // 数値を返却
	}

	/*
	 * 入力プロンプトを表示して整数値を入力するメソッドです。
	 * 入力された整数値を返します。
	 */
	public int readInt(String msg) {
		System.out.print(msg); // プロンプト表示
		return readInt(); // readInt()の呼び出し
	}
}