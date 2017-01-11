package com.marat.Lesson_11_Concurency5;

public class TestThreadJoin {

	public static void main(String[] args) {

		MarketNews3 mn = new MarketNews3("Market News");
		mn.start();
		
		Portfolio3 p = new Portfolio3("Portfolio data");
		p.start();
		
		try{
			mn.join();
			p.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		//main метод побежит дальше когда оба thread закончатся, а именно join() два threads.
		
		System.out.println("Finished joinThread...");
	}

}
