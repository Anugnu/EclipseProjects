package com.implementingrunnableinterface;

public class TestRunnableExample {

	public static void main(String[] args) {
		
		RunnableExample t1 = new RunnableExample("thread 1");
		t1.startThread();

		RunnableExample t2 = new RunnableExample("thread 2");
		t2.startThread();
	}

}
