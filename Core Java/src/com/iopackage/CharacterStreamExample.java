package com.iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://files//hello.txt");
		FileWriter fw = new FileWriter("D://files//output1.txt");
		
		int c;
		while((c=fr.read())!= -1) {
			fw.write(c);
		}
		
	}

}
