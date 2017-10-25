package com.extendingthreadclass;

public class TestThreadExample {

	public static void main(String[] args) {
		//(3) when a new object is created it goes to running state
		ThreadExample t1 = new ThreadExample("thread 1");
		t1.start();//(4) to start the thread
		
		ThreadExample t2 = new ThreadExample("thread 2");
		t2.start();
	}

}
//(5)output is inconsistent, so synchronization method is used to make it consistent