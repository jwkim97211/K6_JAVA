package com.ruby.java.ch08.innerClass;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		inner01.a = 123;
		inner02.b = 456;
		inner01.method2();
		inner02.method3();
		OuterClass.StaticClass.c = 789; //static이기 때문에
		OuterClass.StaticClass.method4();

	}

}
