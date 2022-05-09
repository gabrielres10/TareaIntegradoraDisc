package generics;

public class Queue<T> {

	private int size;

	private QueueNode<T> head;

	/**
	 * Empty constructor
	 */
	public Queue() {
	}

	/**
	 * This method initializes the Queue whit a value
	 * 
	 * @param value, T, value which will take the node named "head"
	 */
	public Queue(T value) {
		this.head = new QueueNode<T>(value);
	}

	/**
	 * This method returns the length of the Queue
	 * 
	 * @return size, int, length of the Queue
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * This method returns false if the Queue is not empty, else, it´s returns true
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (size != 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method is the trigger method of "contains" method
	 * 
	 * @param value, T, value Searched
	 * @return true, boolean, if Queue contains the node whit value searched
	 * @return false, boolean, if Queue don´t contains the node whit value searched
	 */
	public boolean contains(T value) {
		return contains(head, value);
	}

	/**
	 * This method verifies if the Queue contains the searched value
	 * 
	 * @param value,   T, value Searched
	 * @param current, (T) QueueNode, node witch value is compares to value searched
	 * @return true, boolean, if Queue contains the node whit value searched
	 * @return false, boolean, if Queue don´t contains the node whit value searched
	 */
	private boolean contains(QueueNode<T> current, T value) {
		// Stop condition #1
		if (value.equals(current.getValue())) {
			return true;
		}
		// Stop condition #2
		if (current.getNext().equals(null)) {
			if (value.equals(current.getValue())) {
				return true;
			} else {
				return false;
			}
		}

		// recursion
		return contains(current.getNext(), value);

	}

	public void clear() {
		this.head = null;
	}

	/**
	 * This method is the trigger method of the "enqueue" method
	 * 
	 * @param value, T, value witch will have the new node of the queue
	 */
	public void enqueue(T value) {
		enqueue(head, value);
	}

	/**
	 * This method adds a node at the end of the queue
	 * 
	 * @param value,   T, value witch will have the new node of the queue
	 * @param current, (T) QueueNode, node witch value is do the recursion
	 */
	private void enqueue(QueueNode<T> current, T value) {
		// TODO Auto-generated method stub

		// Stop condition #1
		if (current.getNext().equals(null)) {
			current.setNext(new QueueNode<T>(value));
		}

		// Recursion
		enqueue(current.getNext(), value);

	}

	/**
	 * This method deletes the first element of the Queue and returns it
	 * 
	 * @return T, the value of the first element of the Queue
	 */
	public T dequeue() {
		QueueNode<T> node = head.getNext();

		node.setNext(head.getNext());

		head = node;

		return head.getValue();
	}

	/**
	 * This method is the trigger method of "get" method
	 * 
	 * @param i, int, index of node searched
	 * @return T, if Queue contains the node whit index searched
	 * @return null, if Queue does not contains the node whit index searched
	 */
	public T get(int i) {
		return get(head, i);
	}

	/**
	 * This method returns the node according to the index passed by parameter
	 * 
	 * @param i,       int, index of node Searched
	 * @param current, (T) QueueNode, node witch value is do the recursion
	 * 
	 * @return T, if Queue contains the node whit index searched
	 * @return null, if Queue does not contains the node whit index searched
	 */
	private T get(QueueNode<T> current, int i) {
		if (current.getIndex() == i) {
			return current.getValue();
		}

		if (current.getNext().equals(null)) {
			if (current.getIndex() == i) {
				return current.getValue();
			} else {
				return null;
			}
		}
		return get(current.getNext(), i);
	}

	/*
	 * ----------Getters & Setters----------
	 */

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the head
	 */
	public QueueNode<T> getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(QueueNode<T> head) {
		this.head = head;
	}

}
