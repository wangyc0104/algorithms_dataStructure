package wyc.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ��������Ķ�����
 * @author ���Գ�
 */
public class LinkedBinaryTree implements BinaryTree {

	/**
	 * �����
	 */
	private Node root;// �����

	/**
	 * �����
	 */
	// private int size;

	public LinkedBinaryTree() {
		super();
	}

	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public int size() {
		System.out.println("��������������");
		return this.size(root);
	}

	private int size(Node root) {
		if (root == null) {
			return 0;
		} else {
			// ��ȡ��������size
			int nl = this.size(root.leftChild);
			// ��ȡ��������size
			int nr = this.size(root.rightChild);
			// ������������������size֮�Ͳ���1
			return nl + nr + 1;
		}
	}

	@Override
	public int getHeight() {
		System.out.println("�������ĸ߶��ǣ�");
		return this.getHeight(root);
	}

	private int getHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			// ��ȡ�������ĸ߶�
			int nl = this.getHeight(root.leftChild);
			// ��ȡ�������ĸ߶�
			int nr = this.getHeight(root.rightChild);
			// �������������������ϴ�߶Ȳ���1
			return nl > nr ? nl + 1 : nr + 1;
		}
	}

	@Override
	public Node findKey(int value) {
		return this.findKey(value, root);
	}

	public Node findKey(Object value, Node root) {
		if (root == null) {// �ݹ��������1�����Ϊ�գ��������������ĸ��ڵ㣬Ҳ�����ǵݹ������Ҷ�ӽڵ������Ӻ��Һ���
			return null;
		} else if (root != null && root.value == value) {// �ݹ�Ľ�������2���ҵ���
			return root;
		} else {// �ݹ���
			Node node1 = this.findKey(value, root.leftChild);
			Node node2 = this.findKey(value, root.rightChild);
			if (node1 != null && node1.value == value) {
				return node1;
			} else if (node2 != null && node2.value == value) {
				return node2;
			} else {
				return null;
			}
		}

	}

	@Override
	public void preOrderTraverse() {
		if (root != null) {
			// 1.���������ֵ
			System.out.print(root.value + "  ");
			// 2.�������������������
			// ����һ���������������������ĸ�
			BinaryTree leftTree = new LinkedBinaryTree(root.leftChild);
			leftTree.preOrderTraverse();
			// �������������������
			// 3.����һ���������������������ĸ�
			BinaryTree rightTree = new LinkedBinaryTree(root.rightChild);
			rightTree.preOrderTraverse();
		}
	}

	@Override
	public void inOrderTraverse() {
		System.out.println("�������");
		this.inOrderTraverse(root);
		System.out.println();
	}

	private void inOrderTraverse(Node root) {// node7
		if (root != null) {
			// ����������
			this.inOrderTraverse(root.leftChild);// null
			// �������ֵ
			System.out.print(root.value + "  ");// 7
			// ����������
			this.inOrderTraverse(root.rightChild);// null
		}
	}

	@Override
	public void postOrderTraverse() {
		System.out.println("�������");
		this.postOrderTraverse(root);
		System.out.println();
	}

	@Override
	public void postOrderTraverse(Node node) {
		if (node != null) {
			// ����������
			this.postOrderTraverse(node.leftChild);
			// ����������
			this.postOrderTraverse(node.rightChild);
			// �������ֵ
			System.out.print(node.value + "  ");
		}
	}

	@Override
	public void inOrderByStack() {
		System.out.println("����ǵݹ����:");
		// ����ջ
		Deque<Node> stack = new LinkedList<Node>();
		Node current = root;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.leftChild;
			}
			if (!stack.isEmpty()) {
				current = stack.pop();
				System.out.print(current.value + " ");
				current = current.rightChild;
			}
		}
		System.out.println();
	}

	@Override
	public void preOrderByStack() {
		// TODO ǰ��ǵݹ����
	}

	@Override
	public void postOrderByStack() {
		// TODO ����ǵݹ����
	}

	@Override
	public void levelOrderByStack() {
		System.out.println("���ղ�α���������");
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (queue.size() != 0) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				Node temp = queue.poll();
				System.out.print(temp.value + " ");
				if (temp.leftChild != null) {
					queue.add(temp.leftChild);
				}
				if (temp.rightChild != null) {
					queue.add(temp.rightChild);
				}
			}
		}
		System.out.println();
	}

}
