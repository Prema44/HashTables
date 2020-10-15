package datastructures;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	/**
	 * Searching the key in linked list
	 * 
	 * @param key
	 * @return
	 */
	public INode<K> search(K key) {
		INode<K> temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	/**
	 * Appending the node at last
	 * 
	 * @param newNode
	 */
	public void append(INode<K> newNode) {
		if (head == null) {
			this.head = newNode;
		}
		if (tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}

	public String toString() {
		return "MyLinkedListNode{" + head + "}";
	}
}