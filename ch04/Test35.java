package com.ruby.java.ch04;

public class Test35 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		for(int num:arr) {
			System.out.println(num);  //배열의 모든 원소를 출력할 경우, index 사용이 필요없음
		}
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);  //인덱스가 0,1,2인 원소를 출력할 경우
		}

	}

}
