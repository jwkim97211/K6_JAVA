package com.ruby.java.ch06;

abstract class InterfaceStudents {
	public abstract void showObject();
}

class Student extends InterfaceStudents {
	static int countStudents;  //static으로 선언했으므로 공유
	int sid;
	String sname;
	String city;

	public Student() {
//		sid = 0;
//		sname = null;
//		city = null;
		countStudents++;
	}

	public Student(int sid) {
		this(); // 밑에 주석처리한 코드를 가져옴
		this.sid = sid;
		// sname = null;
		// city = null;
		// countStudents++;
	}

	public Student(int sid, String sname, String city) {
		this(sid);
		this.sname = sname;
		this.city = city;
	}

	public String toString() {
		return "sid = " + sid + ", sname = " + sname + ", city = " + city;
	}

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}

	static void showNumberObjects() {
		System.out.println("생성객체수 = " + countStudents);
	}
}

class WorkStudent extends Student {
	String eno;
	String company;

	public WorkStudent(int sid, String sname, String city, String eno, String company) {
		super(sid, sname, city);
		this.eno = eno;
		this.company = company;
	}

	public String toString() {
		return super.toString() + ", eno = " + eno + ", company = " + company;
	}

	public void showObject() {
		super.showObject();
		System.out.println("[" + eno + ", " + company + "]");
	}
}

class CodingWorkStudent extends WorkStudent {
	String language;

	public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
		super(sid, sname, city, eno, company);
		this.language = language;
	}

	public String toString() {
		return super.toString() + ", language = " + language;
	}

	public void showObject() {
		super.showObject();
		System.out.println("[" + language + "]");
	}
}

public class Test_객체배열 {
	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}

	public static void main(String[] args) {
		Student array[] = new Student[5];
		Student.showNumberObjects();
		array[0] = new Student();
		array[1] = new Student(202301);
		array[2] = new Student(202301, "Hong", "Busan");
		array[3] = new WorkStudent(202301, "Hong", "Busan", "e1", "naver");
		array[4] = new CodingWorkStudent(202301, "Hong", "Busan", "e1", "naver", "korean");
		Student.showNumberObjects();
		for (Student s : array) {
			System.out.println(s.toString());
		}
		for (Student sx : array) {
			showObjects(sx);
		}
	}

}
