package com.pratice.DSA;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeConsumer implements Consumer<Employees> {

	List<Employees> employees = List.of(new Employees(101, "Prabhat", "Kantar", 49000.10),
			new Employees(102, "Jack", "Google", 120000.10), new Employees(103, "Alice", "Meta", 149000.10),
			new Employees(104, "Sagar", "Kantar", 56000.10), new Employees(105, "Prasanth", "Kantar", 88000.10));

	@Override
	public void accept(Employees t) {

		Collections.sort(employees, new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}

		});

		for (Employees e : employees) {
			System.out.print(e + " ");
		}
	}
	public static void main(String args[])
	{
		EmployeeConsumer consumer=new EmployeeConsumer();
		consumer.employees.forEach(consumer);
	}

}
