package generics;

public class Stack<T> {

	StackNode<T> root;

	/**
	 * This method verifies if the stack is empty
	 * 
	 * @return true, if the stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	/**
	 * This method pushes a value to the stack
	 * 
	 * @param value, T, this is the value to push
	 */
	public void push(T value) {
		StackNode<T> newNode = new StackNode<>(value);

		if (root == null) {
			root = newNode;
		} else {
			StackNode<T> temp = root;
			root = newNode;
			newNode.setNext(temp);
		}
		System.out.println(value + " pushed to stack");
	}

	/**
	 * This method returns the last added element, and deletes it
	 * 
	 * @return popped, T, this is the last added element
	 */
	public T pop() {
		T popped = null;
		if (root == null) {
			System.out.println("Stack is Empty");
		} else {
			popped = root.getValue();
			root = root.getNext();
		}
		return popped;
	}
	
	/**
	 * This method returns the last added element
	 * @return
	 */
	public T peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return root.getValue();
		}
	}
}
