package com.marat.Lesson_11_Concurency4;

public class MarketNews3 extends Thread {

	public MarketNews3(String str){
		super(str);
	}
	
	public void run(){
		
		try {
			for(int i = 0; i < 10; i++){
				sleep(1000);
				System.out.println("The market is improving " + i);
			}
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName() 
					+ e.toString());
		}
		
	}
	
}
