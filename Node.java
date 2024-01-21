//Yarin Ackerman
//Abo Rabia Rami

package part_1;

public class Node<T> {
	
	private T value;
	private Node<T> next;
	
	public Node(T value, Node<T> next) {
		
		setValue(value);
		setNext(next);
		
	}
	
	public Node(T value) {
		
		this(value,null);
	}

	public T getValue() {
		
		return value;
	}

	public void setValue(T value) {
		
		this.value = value;
	}

	public Node<T> getNext() {
		
		return next;
	}

	public void setNext(Node<T> next) {
		
		this.next = next;
	}
	
	
	
	
	
	
}
