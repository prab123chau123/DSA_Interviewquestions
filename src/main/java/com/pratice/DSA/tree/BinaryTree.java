package com.pratice.DSA.tree;

import java.util.HashMap;
import java.util.Stack;

public class BinaryTree {

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

	static class Pair {
		Node node;
		Boolean isFirstValueVisit;

		public Pair(Node node, Boolean isFirstValueVisit) {
			this.node = node;
			this.isFirstValueVisit = isFirstValueVisit;
		}
	}

	static class BuildBinaryTree {
		static int index = -1;

		public static Node buildTree(int[] data) {
			index++;
			if (data[index] == -1) {
				return null;
			}
			Node newNode = new Node(data[index]);
			newNode.left = buildTree(data);
			newNode.right = buildTree(data);
			return newNode;
		}

		public static void preOrder(Node root) {
			if (root == null)
				return;
			Stack<Node> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()) {
				Node currData = stack.pop();
				System.out.print(currData.data + " ");
				if (currData.right != null) {
					stack.push(currData.right);
				}
				if (currData.left != null) {
					stack.push(currData.left);
				}
			}
		}

		public static int height(Node node) {
			if (node == null)
				return 0;
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			return 1 + Math.max(leftHeight, rightHeight);
		}

		public static int sumOfNodes(Node node) {
			if (node == null) {
				return 0;
			}
			return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
		}

		public static int countNodes(Node node) {
			if (node == null) {
				return 0;
			}
			return 1 + countNodes(node.left) + countNodes(node.right);
		}

		public static int diameterOfBinaryTree(Node node) {
			if (node == null)
				return 0;
			Stack<Pair> stack = new Stack<>();
			HashMap<Node, Integer> heightMap = new HashMap<>();
			int diameter = 0;
			stack.push(new Pair(node, true));
			while (!stack.isEmpty()) {
				Pair pair = stack.pop();
				Node currNode = pair.node;
				if (pair.isFirstValueVisit) {
					stack.push(new Pair(node, false));
					if (node.left != null)
						stack.push(new Pair(currNode.left, true));
					if (node.right != null)
						stack.push(new Pair(currNode.right, true));
				} else {
					int leftHeight = heightMap.getOrDefault(currNode.left, 0);
					int rightHeight = heightMap.getOrDefault(currNode.right, 0);
					int currentHeight = Math.max(leftHeight, rightHeight) + 1;
					heightMap.put(currNode, currentHeight);
					int currentDiameter = leftHeight + rightHeight;
					diameter = Math.max(diameter, currentDiameter);
				}
			}
			return diameter;
		}
	}

	public static void main(String args[]) {
		int node[] = { 3, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node node2 = BuildBinaryTree.buildTree(node);
		System.out.println(node2.data);

		BuildBinaryTree.preOrder(node2);
		System.out.println();
		System.out.println(BuildBinaryTree.height(node2));

		System.out.println(BuildBinaryTree.sumOfNodes(node2));

		System.out.println(BuildBinaryTree.countNodes(node2));

	}
}
