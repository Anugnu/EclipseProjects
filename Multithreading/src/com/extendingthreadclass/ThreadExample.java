package com.extendingthreadclass;

public class ThreadExample extends Thread {

	private Thread t;
	private String threadName;
	
	ThreadExample(String name){//(1)setting name
	
		threadName = name;
		System.out.println("creating-> " +threadName);
	}
	
	@Override
	public void run(){//(2)overridden run() from Thread class for writing logic
		synchronized(t){
			System.out.println("running thread-> " +threadName);
			
			for(int i =0; i<5 ; i++){
				System.out.println(" Thread:" +threadName+ " value:" +i);
			}
		}
		
	}
}
