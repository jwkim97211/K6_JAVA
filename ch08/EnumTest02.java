package com.ruby.java.ch08;

/*
 * enum 클래스에 대하여 아래 코드를 학습하는 것이 중요하다
 * 자료구조 코딩을 위해 사전 학습으로 꼭 필요
 * enum 클래스의 생성자는 언제 호출되는가? 이해가 필요 
 */
import java.util.Scanner;

//자료구조시에 사용
enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	// enum의 생성자: enum 상수마다 생성자를 호출하여 초기화한다 - enum 객체가 처음 만들어질 때 호출된다
	Mandarin(int p) {
		price = p;
		System.out.println("enum 생성자 실행:: price = " + price);
	}

	int getPrice() {
		return price;
	}

	static Mandarin MandarinAt(int idx) {
		for (Mandarin m : Mandarin.values())
			if (m.ordinal() == idx)
				return m;
		return null;
	}
}

public class EnumTest02 {
	static Scanner stdIn = new Scanner(System.in);

	static Mandarin selectMenu() {
		int key;
		do {
			for (Mandarin m : Mandarin.values()) {// Mandarin m[] = Mandarin.values();와 의미가 같다
				System.out.print(m.ordinal() + ".");
				System.out.println(" " + m + "(" + m.getPrice() + ")"); //숫자.이름(가격)으로 출력
			}
			System.out.println("선택: ");
			key = stdIn.nextInt();
		} while (key < Mandarin.금귤.ordinal() || key > Mandarin.황금향.ordinal());

		return Mandarin.MandarinAt(key);
	}

	public static void main(String[] args) {
		Mandarin m;// 생성자를 호출하지 않는다. 변수 선언
//		Mandarin m2 = new Mandarin(100);//생성자를 호출할 수 없다 - 주의점
//		enum은 5개에 문자에 0,1,2,3,4 값을 배정
//		Mandarin m3[] = Mandarin.values();// Mandarin의 생성자를 호출하고 각 값을 생성자 함수에 전달한다.
		// values()는 static 함수로 열거된 모든 원소를 배열로 리턴
		Mandarin m5 = Mandarin.황금향; // 1개의 값만 입력해도 생성자를 호출
//		for(Mandarin mnd : m3) {
			System.out.println("price = " + m5.getPrice());
//		}

		Mandarin ma = Mandarin.한라봉;// enum 클래스 생성자가 호출된다
		System.out.println("enum 객체 생성전");
		System.out.println("황금향과 비교: " + ma.compareTo(Mandarin.레드향)); // ma는 한라봉이고 레드향과 비교
//		emum클래스에서는 compareTo로 비교 if사용안함
		Mandarin m2 = Mandarin.금귤;
		Mandarin ma2 = Mandarin.valueOf("레드향");
		System.out.println(ma2);

		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m4 : list)
			System.out.println(m4 + ":" + m4.getPrice());
	}
}
