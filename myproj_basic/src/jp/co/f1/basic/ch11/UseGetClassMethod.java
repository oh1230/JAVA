package jp.co.f1.basic.ch11;

public class UseGetClassMethod {

	public static void main(String[] args) {

		Computer2 com = new Computer2();
		NotePc6 npc = new NotePc6();

		System.out.println("comオブジェクトのクラスは" + com.getClass() + "です。");
		System.out.println("npcオブジェクトのクラスは" + npc.getClass() + "です。");

	}

}
