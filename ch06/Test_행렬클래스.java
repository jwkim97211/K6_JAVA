package com.ruby.java.ch06;

import java.util.Random;

class Matrix {
	int rows;
	int cols;
	int[] data;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.data = new int[rows * cols];
	}

	void getData() {
		Random rnd = new Random();
		for (int i = 0; i < rows * cols; i++)
			data[i] = rnd.nextInt(10);
	}

	Matrix addMatrix(Matrix x) {
		Matrix m = new Matrix(this.rows, this.cols);
		for (int i = 0; i < rows * cols; i++)
			m.data[i] = this.data[i] + x.data[i];
		return m;
	}

	Matrix multiplyMatrix(Matrix x) {
		Matrix m = new Matrix(this.rows, x.cols);
		for (int i = 0; i < this.rows; i++)
			for (int j = 0; j < x.cols; j++)
				for (int k = 0; k < this.cols; k++)
					m.data[x.cols * i + j] += this.data[this.cols * i + k] * x.data[x.cols * k + j];
		return m;
	}

	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.cols, this.rows);
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				m.data[rows * j + i] = data[cols * i + j];
		return m;
	}

	void showMatrix(String str) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(data[cols * i + j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Test_행렬클래스 {

	public static void main(String[] args) {
		Matrix B = new Matrix(3, 4);
		Matrix C = new Matrix(3, 4);
		Matrix E = new Matrix(4, 5);
		Matrix A, D, F;

		B.getData();
		C.getData();
		E.getData();

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");
		C.showMatrix("C[3][4]");
		A.showMatrix("A[3][4]");

		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");
		E.showMatrix("E[4][5]");
		D.showMatrix("D[3][5]");

		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]");
		F.showMatrix("F[4][3]");

	}

}
