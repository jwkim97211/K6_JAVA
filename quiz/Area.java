package com.ruby.java.quiz;

public class Area {
	int radius;
	int height;
	
	public static double getVolume(int radius, int height) {
		return Math.PI*radius*radius*height;
	}
	
	public static double getArea(int radius, int height) {
		return (2*radius*Math.PI)*(height+radius);
	}
	public static void main(String[] args) {
		System.out.println(getVolume(4, 5));
		System.out.println(getArea(4, 5));
	}

}
