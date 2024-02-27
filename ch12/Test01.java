package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {

	public static void main(String[] args) {
		try (FileInputStream f1 = new FileInputStream("a.txt"); FileOutputStream fo = new FileOutputStream("b.txt");) {
			int c = 0;
			while ((c = f1.read()) != -1) {
				fo.write(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
