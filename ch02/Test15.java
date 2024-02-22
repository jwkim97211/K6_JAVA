package com.ruby.java.ch02;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'F';
		String gender;
		if(c=='F')
			gender = "여자";
		else
			gender = "남자";
		System.out.println(gender);
		String gender1 = (c=='F') ? "여자":"남자"; //삼항연산자(조건절 ? 참일 경우 : 거짓일 경우)
		System.out.println(gender1);
	}

}
