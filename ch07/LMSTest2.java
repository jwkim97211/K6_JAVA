package com.ruby.java.ch07;

public class LMSTest2 {

	public static void main(String[] args) {
		Professor p = new Professor("김푸름", 52, "빅데이터");
		//파라미터값이 들어있는 경우
		//Professor p = new Professor("홍길동",40,"자바");
		Employee e = new Employee("오정임",47,"입학처");
		Student s = new Student("김유빈",20,"컴퓨터 과학");
		
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(s.toString());
	}

}