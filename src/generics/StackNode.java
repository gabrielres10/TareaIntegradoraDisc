package generics;

public class StackNode<T> {
	private T value;
	private StackNode<T> next;

	public StackNode(T value) {
		this.value = value;

	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public StackNode<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(StackNode<T> next) {
		this.next = next;
	}
	
}

