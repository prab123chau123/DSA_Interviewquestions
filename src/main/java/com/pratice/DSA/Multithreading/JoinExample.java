package com.pratice.DSA.Multithreading;

public class JoinExample extends Thread {

	private Integer count = 0;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (this) {
				this.count++;
			}
		}
	}

	public synchronized Integer returnCount() {
		return this.count;
	}

	public static void main(String args[]) throws InterruptedException {

		JoinExample t1 = new JoinExample();
		JoinExample t2 = new JoinExample();

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		Integer c1 = t1.returnCount();
		Integer c2 = t2.returnCount();
		Integer totalCount = c1 + c2;

//		System.out.println("t1 count: " + c1);
//		System.out.println("t2 count: " + c2);
		System.out.println("Total Count: " + totalCount);
	}
}
