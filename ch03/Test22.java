package com.ruby.java.ch03;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		switch(op) {                    // switch에는 byte, short, int, char, String 사용
		case '+':						// switch는 찾은 값에서부터 밑으로 쭉 실행
			System.out.println(a+b);    // 값을 찾고 실행을 멈추고 싶다면 break 사용
		case '-':
			System.out.println(a-b);
		case '*':
			System.out.println(a*b);
		case '/':
			System.out.println(a/b);    // 찾는 값이 없을 경우는 defalut: 사용
		}	
	}

}
