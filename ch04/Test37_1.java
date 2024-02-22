package com.ruby.java.ch04;

import java.util.Random;

public class Test37_1 {         //가독성 좋게

	public static void main(String[] args) {
		Random rnd = new Random();       
		int [] score = new int[20];
		for(int i=0;i<score.length;i++) {
			score[i] = rnd.nextInt(20);
		}
		for(int i=0;i<score.length;i++) {
			if(i%4==0)
				System.out.println();
			if(score[i]<10)
				System.out.print(" ");
			System.out.print(score[i] + " ");
		}
	}

}
