package com.marat.Lesson_11_Concurency3;

public class TestThreads3 {

	public static void main(String[] args) {

		MarketNews3 mn = new MarketNews3("Market News");
		mn.start();
		
		Portfolio3 p = new Portfolio3("Portfolio data");
		p.start();
		
		System.out.println("The main method of TestThreads3 is finished!");
		
	}

}
