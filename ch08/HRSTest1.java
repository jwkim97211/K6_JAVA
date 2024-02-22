package com.ruby.java.ch08;

public class HRSTest1 {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		//Manager m = new Manager();는 오류 발생 추상클래스이기 때문에 인스턴스 생성 불가  
		Director d = new Director();
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		if(s.equals(c)) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
	}
}