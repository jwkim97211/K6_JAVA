package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		System.out.print("Member(String) 생성자 실행 : ");
		System.out.println(name);
	}
	
	public Member(String name,int age) {
		System.out.print("Member(String,int) 생성자 실행 : ");
		System.out.println(name + " : " + age);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}

}
