package com.pratice.DSA.Multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample extends Thread {

	int counter = 0;
	private Lock lock = new ReentrantLock();

	public void Counter() {
		lock.lock();
		try {
			this.counter++;
		} catch (Exception e) {
			e.getMessage();
		} finally {
			lock.unlock();
		}
	}

	public int count() {
		return this.counter;
	}

	public static void main(String args[]) throws InterruptedException {
		LockExample example = new LockExample();
		Thread e1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.Counter();
			}
		});

		Thread e2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.Counter();
			}
		});

		e1.start();
		e2.start();
		e1.join();
		e2.join();
		System.out.println(example.count());
	}
}
