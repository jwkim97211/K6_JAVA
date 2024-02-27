package com.ruby.java.ch02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depositAmount;
		depositAmount = 50000;
		float ratio = 0.14f;
		boolean result = true;
		char gender = 'F'; //문자 1개여서 ''사용
		char c = '\u0057'; // 결과가 문자 1개여서 ''사용
		String greeting = "good morning"; // 문자 여려개여서 ""사용
		System.out.println("code = " + c +", gender =" + gender);
		System.out.print(result); //print는 옆으로 println은 밑으로
		System.out.print("\n저금액" + depositAmount);  //"\n" +은 println과 같음
	}
}
