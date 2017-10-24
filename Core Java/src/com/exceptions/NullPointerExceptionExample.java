package com.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
	

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D://files//hello10.txt");
			out = new FileOutputStream("D://files//output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println("in exception");
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
