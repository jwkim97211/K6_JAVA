package com.ruby.java.ch02;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b,c= 0;
		b = ++a;
		c = a++;
		System.out.println("b=" + b + ", c" + c);
		System.out.println("a=" + a);
		boolean result = (b==c);
		System.out.println("result=" + result);
		short e = 10;
		int f = -e; // 부호변경은 int타입으로 처리
		System.out.println("f=" + f);
		boolean isOn = true;
		while(!isOn) { //반복실행
			
		}
	}

}
