package jp.co.f1.intro.ch10;

public class ChangeArrayElement4 {

	static void changeHotSpring (String[] aryData) {
		aryData[0] = "ベップ";
		aryData[1] = "ユフイン";
		aryData[2] = "イトウ";
	}

	public static void main(String[] args) {

		String[] hotSpring = { "別府", "由布院", "伊東" };

		System.out.println(" -- 三大温泉 -- ");

		for (int i = 0; i < hotSpring.length; i++) {
			System.out.println("hotSpring[" + i + "]の値は、" + hotSpring[i]);
		}

		changeHotSpring(hotSpring);

		System.out.println(" -- 三大温泉 -- ");

		for (int i = 0; i < hotSpring.length; i++) {
			System.out.println("hotSpring[" + i + "]の値は、" + hotSpring[i]);
		}

	}

}
