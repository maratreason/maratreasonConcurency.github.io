package com.marat.Lesson_11_Concurency;

public class TestThreads {

	public static void main(String[] args) {

		MarketNews mn = new MarketNews("Market News");
		mn.start();
		
		Portfolio p = new Portfolio("Portfolio Data");
		p.start();
		
		System.out.println("TestThread is finished!");
		
	}

}
