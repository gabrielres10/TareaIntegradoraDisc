package generics;

public class PriorityQueue<V> {
	PriorityNode<V> head;
	int size;

	/**
	 * This is the constructor method for a linked list
	 */
	public PriorityQueue() {
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
		PriorityNode<V> temp = head;
		while (c < index) {
			temp = temp.getNext();
			c++;
		}
		return temp != null ? temp.getValue() : null;
	}
	
	/**
	 * Gets the node located in a specific position
	 * @param index, this is the position
	 * @return node, generic type, this is the node located in the specified position
	 */
	public PriorityNode<V> getNode(int index) {
		int c = 0;
		PriorityNode<V> temp = head;
		while (c < index) {
			temp = temp.getNext();
			c++;
		}
		return temp != null ? temp : null;
	}
	
	/**
	 * This method sets a value to a specific node, by using the index
	 * @param index, int, index of the node
	 * @param value, V, value of the node
	 */
	public void set(int index, V value) {
		int c = 0;
		PriorityNode<V> temp = head;
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
        PriorityNode<V> temp = head;
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
			PriorityNode<V> temp = head;
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
	
	/**
	 * This method adds a new node with the value and the priority
	 * @param value, V, this is the value
	 * @param priority, this is the priority
	 */
	public void add(V value, int priority) {
		if (head == null) {
			head = new PriorityNode<>(value, priority);
		} else {
			PriorityNode<V> temp = head;
			PriorityNode<V> newNode = new PriorityNode<>(value, priority);
			newNode.linkNext(temp);
			this.head = newNode;
		}
		
		update();
		this.size++;
	}

	private void update() {
		PriorityNode<V> temp = head;
		
		boolean flag = false;
		while(!false) {
			if(temp.getPriority()<temp.getNext().getPriority()) {
				
			}
		}
		
	}

	public int size() {
		return size;
	}
}