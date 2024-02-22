package com.ruby.java.ch02;

public class Test3 {

	public static void main(String[] args) {
		int num = 2147483647;
		long d = 2147483648L; // L을 붙여줘야함 L이 없으면 4byte에 할당
		// d변수가 8byte인지 확인하는 방법
		int dsize = Long.SIZE;
		System.out.println("dsize = " + dsize);
		int numsize = Integer.SIZE;
		System.out.println("numsize = " + numsize);
		float exchangeRate = 1236.50F; //F를 붙여줘야함 F가 없으면 double로 인식
		String st = "Good Day";
	}

}