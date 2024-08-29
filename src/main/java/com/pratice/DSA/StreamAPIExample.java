package com.pratice.DSA;

import java.util.List;
import java.util.function.Consumer;

public class StreamAPIExample {

	public static void main(String args[]) {
		List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(data);
		int sum = data.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		Consumer<Integer> getData = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				if (t % 2 == 0)
					System.out.print(t + " ");
			}
		};

		data.forEach(getData);
	}
}
