package jp.co.f1.intro.ch7exercise;

public class Practice0703 {

	public static void main(String[] args) {

		for (int i = 1; i <= 40; i++) {
			if (i % 2 != 0) {
				continue;
			} else if (i > 20) {
				break;
			} else {
				System.out.println(i);
			}
		}

	}

}
