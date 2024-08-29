package com.pratice.DSA.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImp {

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

		public static Node buildTree(int data[]) {
			index++;
			if (data[index] == -1) {
				return null;
			}
			Node node = new Node(data[index]);
			node.left = buildTree(data);
			node.right = buildTree(data);
			return node;
		}

		public static void preOrder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

		public static void inOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

		public static void postOrder(Node root) {
			if (root == null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}

		public static void printChildNode(Node root) {
			if (root.left == null && root.right == null) {
				System.out.print(root.data + " ");
				return;
			}
			if (root.left != null) {
				printChildNode(root.left);
			}
			if (root.right != null) {
				printChildNode(root.right);
			}
		}

		public static void levelOrder(Node root) {
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
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
	}

	public static void main(String args[]) {
		int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = BinaryTree.buildTree(node);
		System.out.println(root.data);
		BinaryTree.preOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal");
		BinaryTree.inOrder(root);
		System.out.println();
		System.out.println("Post Order Traversal");
		BinaryTree.postOrder(root);
		System.out.println();
		System.out.println("Print Child Node");
		BinaryTree.printChildNode(root);
		System.out.println();
		System.out.println("Level Order");
		BinaryTree.levelOrder(root);
		
		System.out.println();
		BinaryTree.printChildNode(root);
		
	}
}
