package jp.co.f1.basic.ch09;

public class ClassArray {

	public static void main(String[] args) {

		Computer1[] coms = new Computer1[3];

		for (int i = 0; i < coms.length; i++) {
			coms[i] = new Computer1();
		}

		coms[0].setComputer("WindowsXP", 1024);
		coms[1].setComputer("WindowsVista", 2048);
		coms[2].setComputer("Windows7", 3072);

		for (int i = 0; i < coms.length; i++) {
			coms[i].show();
		}

	}

}
