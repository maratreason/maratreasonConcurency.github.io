package com.marat.Lesson_11_Concurency4;

public class Portfolio4 extends Thread{

	private volatile boolean stopMe = false;
	
	public void stopMe(){
		stopMe = true;
	}
	
	public void run(){
		while(!stopMe){
			try{
				
				//Do some portfolio processing here
			}catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName() + e.toString());
			}
		}
	}
	
}
