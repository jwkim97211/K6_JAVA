package com.ruby.java.ch02;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 017; //0은 8진법
		int b = 0xf; //0x는 16진법
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		String hexa = Integer.toHexString(b);
		System.out.println("hexa=" + hexa);
	}

}
