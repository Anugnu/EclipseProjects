package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("D://files//hello1.txt");
			System.out.println("everything is fine");
			out = new FileWriter("D://files//output1.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("In FileNotFoundException");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("In generic Exception");

		} finally {
			System.out.println("execution is mandatory");
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}