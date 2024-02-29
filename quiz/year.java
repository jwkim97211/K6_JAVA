package com.ruby.java.quiz;

public class year {

	public int[] check(int year, int count) {
		int arr[]=new int[count];
		int idx=0;
		for(int i=year;idx<count;i++) {
			boolean flag=false;
			if(i%400==0)
				flag=true;
			else if(i%100==0)
				flag=false;
			else if(i%4==0)
				flag=true;
			else
				flag=false;

			if(flag) {
				arr[idx]=i;
				idx++;
			}
				
		}
		return arr; 
		
	}
	public static void main(String[] args) {
		year y = new year();
		int x[]= y.check(2023,10);
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);

	}

}
