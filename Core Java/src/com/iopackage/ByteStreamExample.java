package com.iopackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("D://files//hello.txt");
		FileOutputStream out = new FileOutputStream("D://files//output.txt");
		
		int c;
		
		while((c = in.read()) != -1) {
			out.write(c);
		}
	}

}
