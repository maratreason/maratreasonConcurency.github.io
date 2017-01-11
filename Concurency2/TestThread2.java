package com.marat.Lesson_11_Concurency2;

public class TestThread2 {

	public static void main(String[] args) {

		MarketNews2 mn2 = new MarketNews2();
		Thread th = new Thread(mn2, "Market News");
		th.start();
		
		Runnable port2 = new Portfolio2();
		Thread th2 = new Thread(port2, "Portfolio Data");
		th2.start();
		
		System.out.println("TestThread2 is finished!");
	}

}
