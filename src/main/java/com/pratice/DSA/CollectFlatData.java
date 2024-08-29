package com.pratice.DSA;

import java.util.ArrayList;
import java.util.List;

public class CollectFlatData<T> {
 private List<T> result;

	public CollectFlatData() {
		result = new ArrayList<>();
	}

	public void collectData(T data) {
		result.add(data);
	}

	public void traverseData() {
		for (T d : result) {
			System.out.print(d + " ");
		}
	}
}
