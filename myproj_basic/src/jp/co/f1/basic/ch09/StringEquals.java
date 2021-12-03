package jp.co.f1.basic.ch09;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = "おはようございます";
		String str2 = "こんにちは";
		String str3 = "さようなら";
		String str4 = "こんにちは";

		if (str1.equals("おはようございます")) {
			System.out.println("str1(" + str1 + ")の文字列は、「おはようございます」と同じです。");
		}

		if (str2.equals(str4)) {
			System.out.println("str2(" + str2 + ")と、str4(" + str4 + ")の文字列は同じです。");
		}

		if (!str2.equals(str3)) {
			System.out.println("str2(" + str2 + ")と、str3(" + str3 + ")の文字列は同じではありません。");
		}

	}

}
