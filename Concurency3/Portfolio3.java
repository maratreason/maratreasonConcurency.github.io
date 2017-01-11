package com.marat.Lesson_11_Concurency3;

public class Portfolio3 extends Thread{

	public Portfolio3(String str){
		super(str);
	}
	
	public void run(){
		
		try{
			for(int i = 0; i < 10; i++){
				sleep(700);
				System.out.println("Yo have " + (500 + i) + " shares of IBM");
			}
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName() + e.toString());
		}
		
	}
	
}
