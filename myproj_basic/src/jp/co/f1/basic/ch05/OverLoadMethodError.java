package jp.co.f1.basic.ch05;

class Computer2 {
	private String os;
	private int memory;

	public void setComputer (String os) {
		this.os = os;
	}

	public String setComputer (String os) {
		String oldOs = this.os;
		this.os = os;
		return oldOs;
	}

	public void setComputer (String os1, int memory1) {
		this.os = os1;
		this.memory = memory1;
	}

	public void setComputer (String os2, int memory2) {
		this.os = os2;
		this.memory = memory2;
	}
}

public class OverLoadMethodError {
	public static void main(String[] args) {

		Computer2 com = new Computer2();
		com.setComputer("WindowsXP");
		com.setComputer("WindowsXP", 1024);
	}
}
