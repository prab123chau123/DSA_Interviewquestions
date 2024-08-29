package com.pratice.DSA.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

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

	static class BinaryTree {
		static int index = -1;

		public static Node buildBinaryTree(int node[]) {
			index++;
			if (node[index] == -1) {
				return null;
			}
			Node newNode = new Node(node[index]);
			newNode.left = buildBinaryTree(node);
			newNode.right = buildBinaryTree(node);
			return newNode;
		}

		public static void preOrder(Node node) {
			if (node == null) {
				return;
			}
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}

		public static void inOrder(Node node) {
			if (node == null)
				return;
			preOrder(node.left);
			System.out.print(node.data + " ");
			preOrder(node.right);
		}

		public static void postOrder(Node node) {
			if (node == null)
				return;
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}

		public static void levelOrder(Node node) {
			Queue<Node> queue = new LinkedList<>();
			queue.add(node);
			queue.add(null);
			while (!queue.isEmpty()) {
				Node currNode = queue.remove();
				if (currNode == null) {
					System.out.println();
					if (queue.isEmpty()) {
						break;
					} else {
						queue.add(null);
					}
				} else {
					System.out.print(currNode.data + " ");
					if (currNode.left != null)
						queue.add(currNode.left);
					if (currNode.right != null)
						queue.add(currNode.right);
				}
			}
		}

		public static void printLeafNode(Node node) {
			if (node.left == null && node.right == null) {
				System.out.print(node.data + " ");
				return;

			}
			if (node.left != null)
				printLeafNode(node.left);
			if (node.right != null)
				printLeafNode(node.right);
		}

		public static int calculateHeight(Node node) {
			if (node == null)
				return 0;
			Queue<Node> queue = new LinkedList<>();
			queue.add(node);
			int height = 0;
			while (!queue.isEmpty()) {
				int levelSize = queue.size();
				height++;
				for (int i = 0; i < levelSize; i++) {
					Node currNode = queue.poll();
					if (currNode.left != null)
						queue.add(currNode.left);
					if (currNode.right != null)
						queue.add(currNode.right);
				}
			}
			return height;
		}

		public static int sumOfNode(Node node) {
			if (node == null)
				return 0;
			return node.data + sumOfNode(node.left) + sumOfNode(node.right);
		}

		public static int findDepth(Node node, int target) {
			if (node == null) {
				return -1;
			}
			Queue<Node> queue = new LinkedList<>();
			queue.add(node);
			int depth = 0;
			while (!queue.isEmpty()) {
				int levelSize = queue.size();
				for (int i = 0; i < levelSize; i++) {
					Node currNode = queue.poll();
					if (currNode.data == target)
						return depth;
					if (currNode.left != null)
						queue.add(currNode.left);
					if (currNode.right != null)
						queue.add(currNode.right);
				}
				depth++;
			}
			return -1;
		}

	}

	public static void main(String args[]) {
		int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node node2 = BinaryTree.buildBinaryTree(node);
		System.out.println(node2.data);
		BinaryTree.preOrder(node2);
		System.out.println();
		BinaryTree.inOrder(node2);
		System.out.println();
		BinaryTree.postOrder(node2);
		System.out.println();
		BinaryTree.levelOrder(node2);
		System.out.println();
		BinaryTree.printLeafNode(node2);
		System.out.println();
		System.out.println(BinaryTree.calculateHeight(node2));
		System.out.println();
		System.out.println(BinaryTree.sumOfNode(node2));
		System.out.println();
		System.out.println(BinaryTree.findDepth(node2, 5));
	}
}
