package org.marialucia.software;

import org.marialucia.software.counter.Counter;
import org.marialucia.software.counter.CounterIncrementer;

public class App2 {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new CounterIncrementer(c));
		Thread t2 = new Thread(new CounterIncrementer(c));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		System.out.println("valore finale: "+c.getCount());
		
		
		
	}

}
