//Yarin Ackerman
//Abo Rabia Rami
package part_1;

public class MyDeque<T> {
	
	private Node<T> front;
	private Node<T> rear;
	
	public MyDeque() {
		
		setFront(null);
		setRear(null);
	}
	
	
	public boolean isEmpty() {
		
		return front==null;
	}
	
	public void insertAtFront(T value) {
		
		Node<T> node=new Node<T>(value);
		
		if(isEmpty()) {

			setRear(node);
		}
			
			node.setNext(front);
			setFront(node);	

	}
	
	public void insertAtBack(T value) {
		
		Node<T> node=new Node<T>(value);
		
		if(isEmpty()) {
			
			setFront(node);
			setRear(node);
		}
		else {
			
			rear.setNext(node);
			setRear(node);	
		}

	}
	
	public T removeFromFront(){
		
		if(isEmpty()) {
			
			System.out.println("List is empty, nothing to remove");
			return null;
		}
		else {
			
			Node<T> temp;
			temp=front;
			setFront(front.getNext());
			return temp.getValue();
		}
	}
	
	public T removeFromBack(){
		
		if(isEmpty()) {
			
			System.out.println("List is empty, nothing to remove");
			return null;
		}
		else if(front.getNext()==null) {
			
			T temp;
			temp=front.getValue();
			
			setFront(null);
			return temp;
			
		}
		else {
			
			Node<T> runner;
			runner=front;
			
			while(runner.getNext()!=rear) {
				
				runner=runner.getNext();
			}
			
			T temp;
			temp=rear.getValue();
			
			runner.setNext(null);
			setRear(runner);
			
			return temp;
		}
	}
	
	public T getFrontValue() {
		
		return front.getValue();
	}
	
	public T getRearValue() {
		
		return rear.getValue();
	}
	
	public void print() {
	
		Node<T> runner;
		runner=front;
		
		if(isEmpty()) {
			
			System.out.println("List is empty");
		}
		
		while(runner!=null) {
			
			System.out.print(runner.getValue()+"->");
			runner=runner.getNext();
		}
		System.out.println();
		
	}
	

	public Node<T> getFront() {
		
		return front;
	}

	public void setFront(Node<T> front) {
		
		this.front = front;
	}

	public Node<T> getRear() {
		
		return rear;
	}

	public void setRear(Node<T> rear) {
		
		this.rear = rear;
	}
	

}

