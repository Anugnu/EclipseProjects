package com.implementingrunnableinterface;

public class RunnableExample implements Runnable {

	private Thread t;
	private String threadName;
	
	RunnableExample(String name){//(1)setting name
		
		threadName = name;
		System.out.println("creating-> " +threadName);
	}
	
	@Override
	public void run() {//(2)overridden run() from Thread class for writing logic
System.out.println("running thread-> " +threadName);
		synchronized(t){
			for(int i =0; i<5 ; i++){
				System.out.println(" Thread:" +threadName+ " value:" +i);
			}
		}
		
	}

	public void startThread(){
		if(t==null){
			t=new Thread(this,threadName);
			t.start();
		}
	}
	
}
