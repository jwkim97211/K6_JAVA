package com.ruby.java.ch04;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];  //new : 공간할당 명령어   arr : 배열이름
		arr[0]=10;
		arr[1]=20;             //int[] arr = {10,20,30,40,50}와 동일
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		int[] score = {90,85,78,100,98};
		char[] alphabet = {'a','b','c','d'};
		String[] name = {"김푸름","김하늘","오정임"};
		System.out.println(score.length);
		System.out.println(name.length);
		
		String st = "nice day";  //문자열은 공백도 길이에 포함
		System.out.println(st.length());  //배열은 () 사용안함, 문자열은 () 사용
	}

}
