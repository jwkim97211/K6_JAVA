package com.ruby.java.quiz;

import java.util.Scanner;

public class PrimeNumber2 {
	public void search(int s, int e) {
		boolean flag = true;
		for (int i = s; i < e; i++) {
			for(int j=2;j<Math.sqrt(i);j++) {
				if() {
					
				}
			}
		}
	}

	public static void main(String[] args) {
		SearchPrime2 sp = new SearchPrime2();
		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수 : ");
		int num = sc.nextInt();
		int s = (int) Math.pow(10.0, (double) (num - 1));
		int e = (int) Math.pow(10.0, (double) (num)) - 1;
		sp.search(s, e);
	}

}
