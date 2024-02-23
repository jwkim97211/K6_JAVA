package com.ruby.java.ch03;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
		if((i % 2)==0) continue;   //조건만족하면 위로(짝수는 출력 안함)
		System.out.println(i);
		}
	}
}