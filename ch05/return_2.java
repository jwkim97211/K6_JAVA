package com.ruby.java.ch05;

public class return_2 {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		
		int num = takeoff(6,7);              //System.out.println(takeoff());
		System.out.println(num);
		
		System.out.println("3");
		System.out.println("4");

	}
	static int takeoff(int a, int b) {
		System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");
		
		return a+b;
	}

}
