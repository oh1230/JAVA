package jp.co.f1.basic.ch09;

public class ObjectAsArgument {

	public static void checkMemory (Computer2 com) {
		int reasonableMemory;
		String os = com.getOs();
		int memory = com.getMemory();
		com.show();

		if (os.equals("Windows7")) {
			reasonableMemory = 3072;
		} else if (os.equals("WindowsVista")) {
			reasonableMemory = 2048;
		} else {
			reasonableMemory = 1024;
		}

		if (memory >= reasonableMemory) {
			System.out.println("⇒メモリサイズは適正です。");
		} else {
			System.out.println("⇒メモリの増設をお勧めします。");
		}
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {

		Computer2 com1 = new Computer2();
		Computer2 com2 = new Computer2();

		com1.setOs("Windows7");
		com1.setMemory(2048);
		com2.setOs("WindowsVista");
		com2.setMemory(2048);

		System.out.println("------------------------------------");
		checkMemory(com1);
		checkMemory(com2);

	}

}
