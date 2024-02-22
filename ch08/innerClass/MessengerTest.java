package com.ruby.java.ch08.innerClass;

interface Messenger {
	
	String getMessage();
	void setMessage(String msg);

}

public class MessengerTest {
	public static void main(String[] args) {
		Messenger test = new Messenger() { //Messenger가 인터페이스이기 때문에 ;가 아닌 {
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			public String getMessage() {
				return "test";
			}
		}; // ;를 작성하는 이유? 
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}
}