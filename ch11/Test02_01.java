package com.ruby.java.ch11;

public class Test02_01 {

	public static void main(String[] args) {
		test1();
	}
	private static void test1() {
		try {
			System.out.println("1");
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
			return; //return을 사용해서 4가 안찍힘
		}finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}

}
