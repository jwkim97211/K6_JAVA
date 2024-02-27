package quiz;

import java.util.Scanner;

public class quiz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int num = sc.nextInt();
		int count = 0;
		for(int a=1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				for(int c=1; c<=10; c++) {
					if(a*2+b*3+c*5==num) {
						System.out.print("(" + a + "," + b + "," + c + ")");
						System.out.println();
						count+=1;
					}
				}
			}

		}
		System.out.println("count : " + count);
	}
}