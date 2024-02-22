package com.ruby.java.ch07;

public class LMSTest2 {

	public static void main(String[] args) {
		Professor p = new Professor();
		//파라미터값이 들어있는 경우
		//Professor p = new Professor("홍길동",40,"자바");
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		System.out.println(p.toString());

		
	}

}