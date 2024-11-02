import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
	}
	private Node first;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
		{throw new NoSuchElementException();}
		else
			return first.data;
	}

	public E removeFirst() {
		if (first == null)
		{throw new NoSuchElementException();}
		else {
		E element = first.data;
		first = first.next;
		return element;}
	}

	public void print(){
           //outputs the data on the list
		Node current = first;
		while (current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

		public static void main(String[] args) {
			CP3LinkedList<String> list = new CP3LinkedList<>();

			// Add elements to the linked list
			list.addFirst("Jay");
			list.addFirst("Kay");
			list.addFirst("Fay");
			list.addFirst("May");
			list.addFirst("Ray");

			// Print the contents of the linked list
			System.out.println("Contents of the linked list:");
			list.print();

			list.addFirst("Pay");
			String firstElement = list.getFirst();
			System.out.println("\nFirst element retrieved using getFirst(): " + firstElement);

			System.out.println("\nContents of the linked list after getFirst():");
			list.print();

			String removedElement = list.removeFirst();
			System.out.println("\nRemoved the first element: " + removedElement);

			System.out.println("\nContents of the linked list after removeFirst():");
			list.print();
		}
	}

