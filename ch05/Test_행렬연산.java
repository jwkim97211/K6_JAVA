package com.ruby.java.ch05;

import java.util.Random;

public class Test_행렬연산 {
	static void showMatrix(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void getData(int[][] x) {
		Random rnd = new Random();
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[0].length; j++)
				x[i][j] = rnd.nextInt(10);
	}

	static int[][] addMatrix(int[][] B, int[][] C) {
		int r = B.length;
		int c = B[0].length;
		int[][] A = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				A[i][j] = B[i][j] + C[i][j];
		return A;
	}

	static int[][] multiplyMatrix(int[][] B, int[][] E) {
		int r = B.length;
		int c = E[0].length;
		int m = B[0].length;
		int[][] D = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				for (int k = 0; k < m; k++)
					D[i][j] += B[i][k] * E[k][j];
		return D;
	}

	static int[][] transposeMatrix(int[][] B) {
		int r = B.length;
		int c = B[0].length;
		int[][] F = new int[c][r];
		for (int i = 0; i < c; i++)
			for (int j = 0; j < r; j++)
				F[i][j] = B[j][i];
		return F;

	}

	public static void main(String[] args) {
		int[][] B = new int[3][4];
		int[][] C = new int[3][4];
		int[][] E = new int[4][5];
		int[][] A = new int[3][4];
		int[][] D = new int[3][5];
		int[][] F = new int[4][3];
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		getData(B);
		getData(C);
		getData(E);
		A = addMatrix(B, C);
		showMatrix(B);
		showMatrix(C);
		showMatrix(A);
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = multiplyMatrix(B, E);
		showMatrix(B);
		showMatrix(E);
		showMatrix(D);
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
		showMatrix(B);
		showMatrix(F);

	}

}
