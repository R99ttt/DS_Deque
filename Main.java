//Yarin Ackerman
//Abo Rabia Rami

package part_1;

public class Main {

	public static void main(String[] args) {

		MyDeque<Integer> d = new MyDeque<Integer>();

		d.insertAtFront(1);
		d.insertAtFront(2);
		d.insertAtFront(3);
		d.insertAtFront(4);
		d.insertAtFront(5);
		d.insertAtFront(6);
		
		
		d.print();

	}

	public static void reverse(MyDeque<Integer> deque) {

		MyDeque<Integer> temp = new MyDeque<Integer>();

		while (!deque.isEmpty()) {

			temp.insertAtFront(deque.removeFromBack());//flip to temp
		}

		while (!temp.isEmpty()) {

			deque.insertAtFront(temp.removeFromFront());//insert to deque from the front
		}
	}

	public static void replaceHalves(MyDeque<Integer> deque) {

		Node<Integer> runner;
		runner = deque.getFront();

		int count = 0;

		while (runner != null) {//until the end
			count++;
			runner = runner.getNext();
		}

		for (int i = 0; i < count / 2; i++) {//until the half of the deque

			deque.insertAtFront(deque.removeFromBack());

		}
	}

	public static void removeIdentical(MyDeque<Integer> deque) {

		Node<Integer> runner;
		runner = deque.getFront();

		while (runner.getNext() != null) {

			if (runner.getValue() == runner.getNext().getValue()) {//the first identical is the next one because its sorted

				runner.setNext(runner.getNext().getNext());
			} else {
				runner = runner.getNext();
			}
		}

	}

	public static void nodeToList(Node<Integer> head) {

		if (head == null) {
			return;
		}

		nodeToList(head.getNext());
		System.out.print(head.getValue() + "->");
		
		
	}
	

	public static boolean isCyclic(Node<Integer> head) {

		if (head == null) {
			return false;
		}

		// Create two pointers, one that will move one node at a time and another
		// that will move two nodes at a time
		Node<Integer> current = head;
		Node<Integer> jumper = head.getNext();
		
		boolean equal = false;

		while ((jumper != null) && equal == false) { // Keep moving the pointers until they either meet or reach the end of the list

			current = current.getNext();
			jumper = jumper.getNext();

			if (jumper != null) {
				jumper = jumper.getNext();
			}
			equal = (current == jumper); // If the pointers have met, we set equal to be true 
		}

		return equal;
	}
//part 2:
	public static Node<Integer> checkCircular(Node<Integer> node) {

		// Create two pointers, one that will move one node at a time and another
		// that will move two nodes at a time
		Node<Integer> slowPointer = node;
		Node<Integer> fastPointer = node.getNext();

		// Keep moving the pointers until they either meet or reach the end of the list
		while (fastPointer != null && fastPointer.getNext() != null) {

			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();

			if (slowPointer == fastPointer) {
				// The pointers have met, which means the list is circular
				// Print the length of the list
				int length = 1;
				slowPointer = slowPointer.getNext();

				while (slowPointer != fastPointer) {

					length++;
					slowPointer = slowPointer.getNext();
				}
				System.out.println("Length of list: " + length);

				// Return a node from the circular part of the list
				return slowPointer;
			}
		}

		// The pointers have reached the end of the list, which means it is not circular
		return null;
	}


}