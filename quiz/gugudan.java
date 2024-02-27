package com.ruby.java.quiz;

import java.util.Scanner;

public class gugudan {
	public void print(int i) {
		System.out.println(i + "단");
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
	}

	public void random() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9사이의 값을 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num + "단");
		for (int j = 1; j <= 9; j++) {
			System.out.println(num + "*" + j + "=" + num * j);
		}

	}

	public void horizontal() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public void three(int col) {
		for (int i = 2; i <= 9 ; i += col) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < col; k++) {
					if(i+k<=9)
					System.out.print((i + k) + "*" + j + "=" + (i + k) * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}