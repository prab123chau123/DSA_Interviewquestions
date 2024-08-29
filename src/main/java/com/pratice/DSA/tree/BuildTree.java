package com.pratice.DSA.tree;

public class BuildTree {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinarySearchTree {
		static int index = -1;

		public static Node buildTree(int[] root) {
			index++;
			if (root[index] == -1)
				return null;
			Node node = new Node(root[index]);
//			if (root[index] < node.data)
			node.left = buildTree(root);
//			if (root[index] > node.data)
			node.right = buildTree(root);
			return node;
		}

		public static void preOrder(Node node) {
			if (node == null)
				return;
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String args[]) {
       int arr[]= {50,30,70,20,40,60,80};
       Node node= BinarySearchTree.buildTree(arr);
       BinarySearchTree.preOrder(node);
       
	}

}
