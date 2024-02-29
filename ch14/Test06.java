package com.ruby.java.ch14;

interface Myfunc<T> {
	T modify(T t);
}

public class Test06 {

	public static void main(String[] args) {
		Myfunc<String> mf1 = (str)-> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));
		
		Myfunc<Integer> mf2 = (n)-> n*2;
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}

}
