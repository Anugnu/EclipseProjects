package com.exceptions;

public class RunTimeException {

	public static void main(String[] args) {
		try {
			
			int numbers[] = {1,2,3,4,5};
			System.out.println("value at 1st location: " +numbers[0]);
			System.out.println("vale at 3rd location: " +numbers[3]);
			System.out.println("value at 10th location" +numbers[10]);
			
			
			int a = 100;
			int b = 0;
			int result = a / b;

			System.out.println("result is :" + result);
		} catch (ArithmeticException ae) {
			System.out.println("There is some issue in the system.... Please try again after some time");
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ao) {
			System.out.println("handling Array Index Out Of Bound");
		}

	}

}
