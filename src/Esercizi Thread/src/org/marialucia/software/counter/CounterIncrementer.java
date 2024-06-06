package org.marialucia.software.counter;

public class CounterIncrementer implements Runnable {
	private Counter counter;
	
	public CounterIncrementer(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		while(counter.getCount()<counter.getMaxCount()) {
			counter.incrementa();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
