package com.ruby.java.ch05;

public class return_ {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");

		String num = takeoff(); // System.out.println(takeoff());
		System.out.println(num);

		System.out.println("3");
		System.out.println("4");

	}

	static String takeoff() {
		System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");

		return "return";
	}

}
