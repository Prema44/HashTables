package datastructures;

public class MyHashMap<K, V> {
	MyLinkedList<K> list;

	public MyHashMap() {
		list = new MyLinkedList<>();
	}

	/**
	 * Adding a new key value pair to list or updating the value for existing key
	 * 
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		MyMapNode<K, V> node = (MyMapNode) this.list.search(key);
		if (node == null) {
			node = new MyMapNode<>(key, value);
			this.list.append(node);
		} else {
			node.setValue(value);
		}
	}

	/**
	 * Returning the value for respective key
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		MyMapNode<K, V> node = (MyMapNode) this.list.search(key);
		V value;
		if (node == null) {
			value = null;
		} else {
			value = node.getValue();
		}
		return value;
	}

	public String toString() {
		return "MyHashNodes{" + list + " }";
	}
}
