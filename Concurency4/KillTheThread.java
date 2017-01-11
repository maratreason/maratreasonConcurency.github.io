package com.marat.Lesson_11_Concurency4;

public class KillTheThread {

	public static void main(String[] args) {

		Portfolio4 p = new Portfolio4("Portfolio data");
		
		p.start();
		
		p.stopMe();
	}

}
