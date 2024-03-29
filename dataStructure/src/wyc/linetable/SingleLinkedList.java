package wyc.linetable;

/**
 * 实现一个简单的单链表
 * @author 王以诚
 */
public class SingleLinkedList implements List {

	private Node head = new Node();// 头结点，不存储数据，为了编程方便
	private int size;// 一共有几个结点

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object get(int i) {
		// 可就和顺序表不一样了,不能通过索引直接计算定位，而需要从头结点开始进行查找
		Node p = head;
		for (int j = 0; j <= i; j++) {
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO 该链表是否包含某个元素？
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO 某个元素的索引值查找
		return 0;
	}

	@Override
	public void add(int i, Object e) {
		// 如果i位置错误报异常
		if (i < 0 || i > size) {
			throw new MyArrayIndexOutOfBoundsException("数组越界异常：" + i);
		}

		// 找到前一个结点，从head结点开始
		Node p = head;
		for (int j = 0; j < i; j++) {
			p = p.next;
		}
		// 新创建一个结点
		// Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		// newNode.next = null;
		// 指明新结点的直接后继结点
		newNode.next = p.next;
		// 指明新结点的直接前驱结点
		p.next = newNode;
		size++;
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		// TODO 在某结点之前添加一个元素（需考虑元素是否可以重复，是否有序排列）
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// TODO 在某结点之后添加一个元素（需考虑元素是否可以重复，是否有序排列）
		return false;
	}

	@Override
	public Object remove(int i) {
		// TODO 移动指定索引下的元素
		return null;
	}

	@Override
	public boolean remove(Object e) {
		// TODO 移动指定的元素
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// TODO 替换某索引的元素
		return null;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node p = head.next;
		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				builder.append(p.data + ",");
			} else {
				builder.append(p.data);
			}
			// 移动指针到下一个结点
			p = p.next;

		}
		builder.append("]");
		return builder.toString();
	}

}
