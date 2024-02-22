package com.ruby.java.ch04;

import java.util.Random;

public class Test38_1 {
	public static void main(String[] args) {
		int[][] score = new int[5][5];
		Random rnd = new Random();       
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j]=rnd.nextInt(500);
		}
	}	
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				if(i==j) System.out.print(score[i][j] + " ");
				else System.out.println("\t");
			}
			System.out.println("\n");
		}
	}

}
