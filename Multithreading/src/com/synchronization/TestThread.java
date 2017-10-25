package com.synchronization;

public class TestThread {

	public static void main(String[] args) {
		
		PrintDemo demo = new PrintDemo();
		
		ThreadDemo thread1 = new ThreadDemo("t1", demo);
		thread1.setPriority(5);//NORMAL_PRIORITY
		
		ThreadDemo thread2 = new ThreadDemo("t2", demo);
		thread2.setPriority(10);//MAX_PRIORITY
								//MIN_PRIORITY=1
		thread1.start();
		
		thread2.start();

	}

}
