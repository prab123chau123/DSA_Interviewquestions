package com.pratice.DSA;

public class Student {

	private static Student student;
	private static int count = 0;

	private Student() {

	}

	public static Student getInstance() {
		if (count < 3) {
			count++;
			student = new Student();
		}
		return student;
	}

	public static void main(String args[]) {
		Student student1 = Student.getInstance();
		Student student2 = Student.getInstance();
		Student student3 = Student.getInstance();
		Student student4 = Student.getInstance();
		Student student5 = Student.getInstance();
		System.out.println(student1.equals(student2));
		System.out.println(student2.equals(student3));
		System.out.println(student3.equals(student4));
		System.out.println(student4.equals(student5));
		System.out.println();
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
		System.out.println(student5.hashCode());
	}
}
