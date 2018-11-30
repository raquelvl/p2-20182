package tree;

import java.util.Iterator;
import java.util.Stack;

/**
 * BinaryTree implementation.
 */
public class BinaryTree<T> implements Iterable<BinaryTree<T>> {
	private TreeNode<T> root;

	public BinaryTree() {
	}

	public BinaryTree(T data) {
		createLeaf(data);
	}

	public BinaryTree(BinaryTree<T> left, T data, BinaryTree<T> right) {
		createLeaf(data);
		addSubLeft(left);
		addSubRight(right);
	}

	public void createLeaf(T data) {
		root = new TreeNode<T>(data);
	}

	public void addSubLeft(BinaryTree<T> tree) {
		root.leftTree = tree;
	}

	public void addSubRight(BinaryTree<T> tree) {
		root.rightTree = tree;
	}

	public T element() {
		return root.data;
	}

	public BinaryTree<T> left() {
		return root.leftTree;
	}

	public BinaryTree<T> right() {
		return root.rightTree;
	}

	public boolean empty() {
		return root == null;
	}

	@Override
	public Iterator<BinaryTree<T>> iterator() {
		return new PreOrderIterator(this);
	}

	private class PreOrderIterator implements Iterator<BinaryTree<T>> {

		Stack<BinaryTree<T>> stack = new Stack<BinaryTree<T>>();

		public PreOrderIterator(BinaryTree<T> binaryTree) {
			stack.push(binaryTree);
		}

		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public BinaryTree<T> next() {
			BinaryTree<T> tree = stack.pop();
			TreeNode<T> node = tree.root;
			if (node.rightTree != null) {
				stack.push(node.rightTree);
			}
			if (node.leftTree != null) {
				stack.push(node.leftTree);
			}
			return tree;
		}
	}
}