package com.ruby.java.ch11;

public class Test01_1 {
	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
	}

	private static void test1() {
		System.out.println("Test1 start");
		test2();
		System.out.println("Test1 exd");
	}

	private static void test2() {
		System.out.println("Test2 start");
		try {
			int tmp = 10/0; //ArithmeticException 오류가 발생
			//catch에 ArithmeticException오류 예외처리가 없기 때문에
			//catch(Exception)으로 이동 
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		} catch (NullPointerException e2) {
			e2.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("Test2 end");
	}
}