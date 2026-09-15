package com.threads.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Thread.UncaughtExceptionHandler;

//How to handle exception in threads?
//class CommonExHandler implements UncaughtExceptionHandler{
//    @Override
//    public void uncaughtException(Thread t, Throwable e) {
//        System.out.println("I am common ,ex happends "+ t.getName()+": "+ e.toString());
//    }
//
//}
//class MyExHandler implements UncaughtExceptionHandler{
//    @Override
//    public void uncaughtException(Thread t, Throwable e) {
//        System.out.println("ex happends "+ t.getName()+": "+ e.toString());
//    }
//
//}
class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader =
                    new BufferedReader(new FileReader("foo.txt"))){
            ///
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class D_HandingExInThreads {

    public static void main(String[] args) {
    	//how to handle exception in threads
    	//UncaughtExceptionHandler
        //Thread.setDefaultUncaughtExceptionHandler(new CommonExHandler());
    	try {
        	Thread t=new Thread(new JobWithEx(),"test1");
        	t.start();
        	
    	}catch(Exception e) {
    		System.out.println("ex is handled");
    	}
    	

    }
}
