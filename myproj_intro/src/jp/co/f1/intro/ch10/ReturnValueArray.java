package jp.co.f1.intro.ch10;

public class ReturnValueArray {

	public static void main(String[] args) {

		String[] hotSpring = new String[2];

		hotSpring = makeArray ( "別府", "由布院", "伊東" );

		for (int i = 0; i < hotSpring.length; i++) {
			System.out.println("hotSpring[" + i + "]の値は、" + hotSpring[i]);
		}

	}

	static String[] makeArray (String name1, String name2, String name3) {

		String[] localArray = { name1, name2, name3 };
		return localArray;

	}

}
