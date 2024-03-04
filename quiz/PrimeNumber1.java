package com.ruby.java.quiz;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			boolean flag= true;
		      if (num <= 1) {
		            flag = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                	flag = false;
		                    break;
		                }
		            }
		        }
			

				System.out.println(flag==true?"소수입니다.":"소수가 아닙니다.");
			}

}


