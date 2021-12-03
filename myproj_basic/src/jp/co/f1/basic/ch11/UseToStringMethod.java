package jp.co.f1.basic.ch11;

public class UseToStringMethod {

	public static void main(String[] args) {

		Computer5 com1 = new Computer5();
		System.out.println(com1);

		Computer6 com2 = new Computer6();
		com2.setOsMemory("WindowVista", 2048);
		System.out.println(com2);

	}

}
