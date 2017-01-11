package com.marat.Lesson_11_Concurency;

public class MarketNews extends Thread{

	public MarketNews(String threadName){
		super(threadName);
	}
	
	public void run(){
		System.out.println("The stock market is improving!");
	}
	
}
