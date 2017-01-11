package com.marat.Lesson_11_Concurency4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestThreadWait {

	public static void main(String[] args) {

		MarketNews3 mn = new MarketNews3("Market News");
		mn.start();
		
		Portfolio3 p = new Portfolio3("Portfolio data");
		p.start();
		
		Object theLockKeeper = new Object();
		
		ReentrantLock theLock = new ReentrantLock();
		final Condition notDone = theLock.newCondition();
		
		theLock.lock();
		try{
			System.out.println("Starting to wait...");
			notDone.await(15, TimeUnit.SECONDS);
		}catch(InterruptedException e){
			System.out.println("The main thread is interrupted");
		}
		
		theLock.unlock();
		
		/*synchronized(theLockKeeper){
			try{
				System.out.println("Starting to wait...");
				theLockKeeper.wait(15000);
				
			}catch(InterruptedException e){
				System.out.println("The main thread is interrupted");
			}
		}*/
		System.out.println("Finished!");
		
	}
	
}
