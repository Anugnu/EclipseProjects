package com.statements;

public class SwitchcaseExample {

	public static void main(String[] args) {
		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("student has A grade");
			break;
		case 'B':
			System.out.println("student has B grade");
			break;
		case 'C':
			System.out.println("student has C grade");
			break;
		default:
			System.out.println("average-->");
		}
	}

}
