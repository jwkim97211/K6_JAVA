package quiz;

import java.util.Random;

public class asc {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] A = new int[24];
		for(int i=0;i<A.length;i++) {
			A[i]=rnd.nextInt(100);
			System.out.print(A[i] + " ");
			}
		System.out.println();
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]>A[j]) {
					int tmp = A[j];
					A[j]=A[i];
					A[i]=tmp;
				}		
			}
		}
		for(int i =0;i<A.length;i++)
			System.out.print(A[i] + " ");
	}
}