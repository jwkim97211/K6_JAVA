package com.ruby.java.quiz;

public class gugudanTest {
	public static void main(String[] args) {
		gugudan ggd = new gugudan();

		System.out.println("Start");
		ggd.printVertical();
//		ggd.random();
		System.out.println("-".repeat(15));
		ggd.printHorizontal();
		System.out.println("-".repeat(15));
		ggd.printColumn(3);
		System.out.println("-".repeat(15));
		ggd.printColumn(4);
		System.out.println("-".repeat(15));
		System.out.println("End");
	}

}
