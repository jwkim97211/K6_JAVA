package com.ruby.java.ch03;

public class Test25_2 {

	public static void main(String[] args) {
		int sum_odd = 0;
		int sum_even = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==0) {
				sum_odd+=i;
			} else {
				sum_even+=i;
			}
		}                             
		System.out.println("홀수 합 = " + sum_odd);
		System.out.println("짝수 합 = " + sum_even);
	}

}