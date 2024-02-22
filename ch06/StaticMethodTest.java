package com.ruby.java.ch06;

public class StaticMethodTest {

	public static void main(String[] args) {  //main에 static이 있는 이유 : 객체 생성없이 실행하기 위해서
		StaticMethodTest.print1();            //static이 없으면 인스턴스 생성하고 실행해야함
		//StaticMethodTest.print2();는 오류 print2에는 static이 없음
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
			}
	
	public static void print1() {
		System.out.println("hello");
	}

	public void print2() {
		System.out.println("java");
	}
}
