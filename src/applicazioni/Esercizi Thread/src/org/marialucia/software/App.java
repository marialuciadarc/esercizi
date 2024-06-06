package org.marialucia.software;

import org.marialucia.software.counter.EvenCounter;
import org.marialucia.software.counter.OddCounter;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new OddCounter());
		t1.start();
		
		Thread t2 = new Thread(new EvenCounter());
		t2.start();
	}

}
