package com.ruby.java.ch03;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9; i<10; i++) {
			System.out.println("for OK");
		}
		int j=9;
		while(j<10) {
			System.out.println("while OK");
			j++;
		}
		int k=10;
		do {
			System.out.println("do-while OK");
			k++;
		} while(k<10);   //do while문은 조건이 맞지 않아도 무조건 1번 실행
	}

}
