package com.ruby.java.ch08;

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본금 + 판매수당");
	}
	
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본금 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본금 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본금 * 12 * 2");
	}
}

abstract class Manager extends Employee { //calcBonus() 메서드를 오버라이딩 하지 않아서 abstract로 선언
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본금 + 팀 성과 수당");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본금 * 12 * 6");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		//Manager m = new Manager();는 오류 발생 추상클래스이기 때문에 인스턴스 생성 불가  
		Director d = new Director();
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
	}
}