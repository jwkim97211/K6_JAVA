package com.ruby.java.ch04;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A';                    // 'A'의 유니코드 값은 65
		char[] alphabet = new char[26];
		
		for(int i=0; i<alphabet.length;i++) {
			alphabet[i] = (char)((int)letter+i);  // 유니코드 값인 정수를 char화
		}
		for(char c : alphabet) {
			System.out.println(c);
		}
	}
	
}
