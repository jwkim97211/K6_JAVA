package quiz;

import java.util.Random;

public class matrix_multi {

	public static void main(String[] args) {
		System.out.println("A");
		int[][]A= new int[3][4];
		Random rnd = new Random();
		for(int i=0;i<A.length;i++) {
			for(int j =0;j<A[i].length;j++) {
			A[i][j] = rnd.nextInt(10);
			}
		}
		for(int i=0;i<A.length;i++) {
			for(int j =0;j<A[i].length;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("B");
		int[][]B= new int[4][3];
		Random rnd1 = new Random();
		for(int i=0;i<B.length;i++) {
			for(int j =0;j<B[i].length;j++) {
			B[i][j] = rnd1.nextInt(10);
			}
		}
		for(int i=0;i<B.length;i++) {
			for(int j =0;j<B[i].length;j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("C");
		int[][]C = new int[3][3];
		for(int i=0;i<A.length;i++) {
			for(int j =0;j<B[i].length;j++) {
				for(int k=0;k<A[i].length;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
					System.out.print(C[i][j] + " ");
				}
			System.out.println();
			}
	}

}
