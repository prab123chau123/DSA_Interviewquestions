package com.pratice.DSA.stacks;

public class ImplementQueue {

	static class QueueImp<T> {
		private Object[] arr;
		private Integer rear;
		private Integer size;

		public QueueImp(int n) {
			arr = new Object[n];
			this.rear = -1;
			size = n;
		}

		public boolean isEmpty() {
			return this.rear == -1;
		}

		public void add(T data) {
			if (rear == size - 1) {
				System.out.println("Queue is full");
				return;
			}
			rear = rear + 1;
			arr[rear] = data;
		}

		public void remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return;
			}
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			rear=rear-1;
		}

		@SuppressWarnings("unchecked")
		public T peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return null;
			}
			return (T) arr[0];
		}

		public void print() {
			for (int i = 0; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		public int length()
		{
			if(!isEmpty())
			 return  Integer.parseInt(rear.toString())+1;
			else {
				return -1;
			}
		}
		
	}

	public static void main(String args[]) {
		QueueImp<Double> queueImp = new QueueImp<>(5);
		queueImp.add(1.0);
		queueImp.add(2.0);
		queueImp.add(3.0);
		queueImp.add(4.0);
		queueImp.add(5.0);
		queueImp.remove();
		queueImp.print();
		System.out.println();
		queueImp.remove();
		queueImp.remove();
		queueImp.remove();
		queueImp.print();
		System.out.println();
		System.out.println(queueImp.length());
		
		for(int i=0;i<queueImp.length();i++)
		{
			System.out.println("Hi "+i);
		}
	}
}
