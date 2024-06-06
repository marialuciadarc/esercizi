package org.marialucia.software.counter;

public class Counter {
	private int count = 0;
	private final int MAX_COUNT = 20;
	
	public synchronized void incrementa() {
		if (count<=MAX_COUNT) {
			count++;
			System.out.println(count);
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int getMaxCount() {
		return MAX_COUNT;
	}
}
