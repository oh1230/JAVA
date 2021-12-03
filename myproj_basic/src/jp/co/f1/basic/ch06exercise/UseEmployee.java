package jp.co.f1.basic.ch06exercise;

class Employee {
	static int empNo;
	static int totalNumOfEmp = 500;

	public static void baseSalary(double time,int no) {
	empNo = no;
	System.out.println("empNo : " + no);
	System.out.println("salary : " + 1500 * time + "yen");
	}
	}

public class UseEmployee {

	public static void main(String[] args) {
		System.out.println(Employee.totalNumOfEmp + "people");
		Employee.baseSalary(130.5,10);

	}

}
