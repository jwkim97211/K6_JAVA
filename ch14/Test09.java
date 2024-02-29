package com.ruby.java.ch14;

interface Calculator {
	int func();
}

public class Test09 {

	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test= new Test09();
		int num3 = 30;
		
		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++;
			test.num2++;
			//num3++;   오류발생(람다식에서 사용된 지역변수는 수정불가)
			num4++;
			return num4;
		};
	}

}
