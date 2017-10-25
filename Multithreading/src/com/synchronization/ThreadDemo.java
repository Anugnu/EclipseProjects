package com.synchronization;

public class ThreadDemo extends Thread {

	private Thread t;

	private String threadName;

	PrintDemo printDemo;

	public ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		printDemo = pd;
	}

	@Override
	public void run(){
		synchronized(printDemo){
			printDemo.printCount();
			System.out.println("Thread " +threadName+ " ending");	
		}
		
	}
}
