package generics;

public class PriorityNode <V> {
	private int priority;
	private V value;
	private PriorityNode<V> next;
	
	public PriorityNode(V value, int priority) {
		this.setValue(value);
		this.next = null;
		this.priority = priority;
	}
	
	public void linkNext(PriorityNode<V> n) {
		this.next = n;
	}
	
	public void deleteNext() {
		if(next != null) {
			next = null;
		}
	}
	
	public void updatePriority(int priority) {
		this.priority = this.priority + priority;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public PriorityNode<V> getNext() {
		return next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	public String toString() {
		return "Prioridad = " + priority;
	}
}
