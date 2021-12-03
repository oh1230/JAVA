package jp.co.f1.basic.test;

public class MakeStudentArray {

	private static Student[] makeStudents () {
		Student[] studentList = new Student[3];
		studentList[0] = new Student("神田");
		studentList[1] = new Student("上野");
		studentList[2] = new Student("渋谷");
		return studentList;
	}

	private static void renameFinalStudent (Student[] studentList) {
		studentList[2].setName("大塚");
	}

	public static void main(String[] args) {

		Student[] studentList = makeStudents();

		for (int i = 0; i < studentList.length; i++) {
			System.out.println("学生" + (i + 1) + "の名前は" + studentList[i].getName());
		}

		renameFinalStudent(studentList);

		System.out.println();
		System.out.println("最後の人を" + studentList[2].getName() + "さんに書き換えました。");

	}

}
