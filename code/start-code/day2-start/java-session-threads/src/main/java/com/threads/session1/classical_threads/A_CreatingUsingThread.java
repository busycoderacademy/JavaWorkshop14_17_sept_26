package com.threads.session1.classical_threads;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("some logic");
	}
	
}

public class A_CreatingUsingThread {
    public static void main(String[] args) {
    	System.out.println("Main job of thread: "+ Thread.currentThread().getName());

    	//Creating the job
		//creating the worker
		//assign job to the worker and start the worker
    	
    	System.out.println("Main job of thread done : "+ Thread.currentThread().getName());
    }
}
