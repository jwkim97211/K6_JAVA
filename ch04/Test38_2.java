package com.ruby.java.ch04;

import java.util.Random;

public class Test38_2 {

	public static void main(String[] args) {
		int[][] score = new int[5][5];
		Random rnd = new Random();       
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j]=rnd.nextInt(100);
		}
	}	
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				if(i==j) {
					System.out.println(score[i][j]);
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
