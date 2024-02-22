package com.ruby.java.ch04;

public class Test38 {

	public static void main(String[] args) {
		//int arr[][] = new int[5][];  오류 없음 행은 항상 지정해야함
 		//int arr[][] = new int[][5];  오류 행을 지정하지 않아서
		
		int arr[][]= {{10,20},{30,40},{50,60},{70,80},{90,100}};
		//int arr[][]= {{10,20},{30,40},{50,60,70},{80},{90,100,110,120}};  ragged array
		
		System.out.println(arr.length);         //행의 길이
		System.out.println(arr[2].length);      //[2]열의 길이
	}

}
