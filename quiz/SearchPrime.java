package com.ruby.java.quiz;

import java.util.Scanner;

public class SearchPrime {
	public static void search(long s, long e) {
		for (long i = s; i <= e; i++) {
			boolean flag = true;
			long n =i;
			while (n != 0) {
				if (!prime(n)) {
					flag = false;
					break;
				}n/=10;
			}
			if(flag==true)
				System.out.println(i);

		}

	}

	public static boolean prime(long num) {
		if(num==1)
			return false;
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;		
			}
		
		}
		return flag;

	}

	public static void main(String[] args) {
		SearchPrime sp = new SearchPrime();
		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수 : ");
		int num = sc.nextInt();
		long s = (int) Math.pow(10.0, (double) (num - 1));
		long e = (int) Math.pow(10.0, (double) (num)) - 1;
		sp.search(s, e);
	}

}
