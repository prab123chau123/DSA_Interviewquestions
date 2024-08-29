package com.pratice.DSA.Multithreading;

public class DameonThreadCreation extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Is Dameon Thread");
		} else {
			System.out.println("Non Dameon Thread");
		}
	}

	public static void main(String args[]) {
		DameonThreadCreation threadCreation = new DameonThreadCreation();
		DameonThreadCreation threadCreation1 = new DameonThreadCreation();
//		threadCreation.setDaemon(true);
		threadCreation.setPriority(MAX_PRIORITY);
		threadCreation1.setPriority(NORM_PRIORITY);
		threadCreation.start();
		threadCreation1.start();
	}
}
