package com.ruby.java.quiz;

import java.util.Scanner;

public class SearchPrime {
	public void search(int s, int e) {
		boolean flag = true;
		for (int i = s; i <= e; i++) {
			flag = true;
			for (int k = 2; k < Math.sqrt(i); k++) {
				if (i % k == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SearchPrime sp = new SearchPrime();
		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수 : ");
		int num = sc.nextInt();
		int s = (int) Math.pow(10.0, (double) (num - 1));
		int e = (int) Math.pow(10.0, (double) (num)) - 1;
		sp.search(s, e);

	}
}
