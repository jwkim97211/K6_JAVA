package com.ruby.java.ch03;

import java.util.Scanner;

public class Test21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 : ");
		String op = sc.next();
		
		int a = 12;
		int b = 2;
		
		if (op.equals("+")) {
			System.out.println("값 : " + (a+b));
		} else if (op.equals("-")) {
			System.out.println("값 : " + (a-b));
		} else if (op.equals("*")) {
			System.out.println("값 : " + (a*b));
		} else if (op.equals("/")) {
			System.out.println("값 : " + (a/b));
		}
	}

}
