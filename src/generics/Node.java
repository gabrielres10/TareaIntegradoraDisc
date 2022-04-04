package generics;

public class Node<V> {
	private Node<V> next;
	private V value;

	public Node(V value) {
		this.setValue(value);
		this.next = null;
	}
	
	public void linkNext(Node<V> n) {
		this.next = n;
	}
	
	public Node<V> getNext() {
		return next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}
