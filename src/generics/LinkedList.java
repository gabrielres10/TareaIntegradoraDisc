package generics;

public class LinkedList<V> {

	Node<V> head;
	int size;

	/**
	 * This is the constructor method for a linked list
	 */
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Gets the value located in a specific position
	 * @param index, this is the position
	 * @return value, generic type, this is the value located in the specified position
	 */
	public V get(int index) {
		int c = 0;
		Node<V> temp = head;
		while (c < index) {
			temp = temp.getNext();
			c++;
		}
		return temp != null ? temp.getValue() : null;
	}
	
	/**
	 * This method sets a value to a specific node, by using the index
	 * @param index, int, index of the node
	 * @param value, V, value of the node
	 */
	public void set(int index, V value) {
		int c = 0;
		Node<V> temp = head;
		while (c < index) {
			temp = temp.getNext();
			c++;
		}
		temp.setValue(value);
	}
	
	/**
     * It looks for an element in the heap.
     * @param V value, value of node to look for.
     * @return true if the value exists on heap
     */
    public boolean contains(V value){
        Node<V> temp = head;
        boolean exists = false;
        while(exists != true && temp != null){
            if (value == temp.getValue()) {
                exists = true;
            }
            else{
            	temp = temp.getNext();
            }
        }
        // flag value
        return exists;
    }

    /**
     * Deletes the first element of the 
     */
	public void deleteFirstElement() {
		head = head.getNext();
		size--;
	}

	public V getFirstElement() {
		return (size != 0) ? head.getValue() : null;
	}
	
	public void delete (int index) {
		if(index == 0) {
			head = head.getNext();
		}else {
			int c = 0;
			Node<V> temp = head;
			while(c < index-1) {
				temp = temp.getNext();
				c++;
			}
			temp.linkNext(temp.getNext().getNext());
		}
		this.size--;
	}
	
	public boolean isEmpty() {
		return (size == 0) ? true : false;
	}

	public void add(V value) {
		if (head == null) {
			head = new Node<V>(value);
		} else {
			Node<V> temp = head;
			Node<V> newNode = new Node<>(value);
			newNode.linkNext(temp);
			this.head = newNode;
		}

		this.size++;
	}

	public int size() {
		return size;
	}

}
