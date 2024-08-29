package com.pratice.DSA;

import java.util.List;
import java.util.function.Consumer;

public class Consumers implements Consumer<Integer> {

	List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
	int sum = 0;

	@Override
	public void accept(Integer t) {
		if (t % 2 == 0) {
			System.out.print(t + " ");
			sum += t;
		}
	}

	public void processData() {
		data.forEach(this);
		System.out.println("Sum of the list is " + sum);
	}

	public static void main(String args[]) {
		Consumers consumers = new Consumers();
		consumers.processData();
	}

}
