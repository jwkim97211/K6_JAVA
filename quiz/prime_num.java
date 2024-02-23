package quiz;

import java.util.Scanner;

public class prime_num {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			boolean flag = true;
			if(num==2) {
				System.out.println("소수입니다.");
			} else {
				for(int i=2; i<num; i++) {
					if(num%i==0) {
						flag=false;		
					}
				}
				System.out.println(flag==true?"소수입니다.":"소수가 아닙니다.");
			}

	}

}
