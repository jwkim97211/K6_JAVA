package com.ruby.java.ch07;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		//파라미터값이 없는 경우
		 super();
		//파라미터값이 들어있는 경우
		//public Professor(String name, int age, String subject) {
		//super.setName(name);
		//super.setAge(age);         //super(name,age)
		//this.subject=subject;
		System.out.println("Professor 생성자");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
