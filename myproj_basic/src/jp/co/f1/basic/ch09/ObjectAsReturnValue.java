package jp.co.f1.basic.ch09;

public class ObjectAsReturnValue {

	public static Computer3 makeComputer (String os) {
		int reasonableMemory;

		if (os.equals("Windows7")) {
			reasonableMemory = 3072;
		} else if (os.equals("WindowsVista")) {
			reasonableMemory = 2048;
		} else {
			reasonableMemory = 1024;
		}

		Computer3 com = new Computer3(os, reasonableMemory);

		return com;
	}

	public static void main(String[] args) {

		String os1 = "Windows7";
		String os2 = "WindowsXP";

		Computer3 com1 = makeComputer(os1);
		Computer3 com2 = makeComputer(os2);

		System.out.print("作成した1台目の");
		com1.show();
		System.out.println("------------------------------------------------");
		System.out.print("作成した2台目の");
		com2.show();

	}

}
