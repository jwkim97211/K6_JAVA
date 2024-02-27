package com.ruby.java.quiz;

import java.util.Random;

public class matrix {

	public static void main(String[] args) {
		System.out.println("A");
		int[][] A = new int[3][4];
		Random rnd = new Random();       
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				A[i][j]=rnd.nextInt(10);
		}
	}	
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("B");
		int[][] B = new int[4][5];
		Random rnd1 = new Random();       
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				B[i][j]=rnd1.nextInt(10);
		}
	}	
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("C");
		int[][] C = new int[3][5];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				for(int k=0;k<A[i].length;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
				System.out.print(C[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		System.out.println("D");
		int[][] D = new int[3][4];
		Random rnd2 = new Random();       
		for(int i=0; i<D.length; i++) {
			for(int j=0; j<D[i].length; j++) {
				D[i][j]=rnd2.nextInt(10);
		}
	}	
		for(int i=0; i<D.length; i++) {
			for(int j=0; j<D[i].length; j++) {
				System.out.print(D[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("E");
		int[][] E = new int[3][4];
		for(int i=0; i<E.length; i++) {
			for(int j=0; j<E[i].length; j++) {
					E[i][j]=A[i][j]+D[i][j];
					System.out.print(E[i][j]);
					System.out.print("\t");
				}
			System.out.println();
			}
		
		
		System.out.println("F");
		int F[][] = new int[4][3];
			for(int i=0;i<A[0].length;i++) {
				for(int j=0;j<A.length;j++) {
					F[i][j]=A[j][i];
					System.out.print(F[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
	}

}
