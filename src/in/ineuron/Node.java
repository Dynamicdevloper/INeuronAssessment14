package in.ineuron;

public class Node {

	int data;
	Node next;
	Node random;
	Node child;
	
	public Node(int data) {
		this.data=data;
	}
	
}

class LinkedList{
	Node head;
	Node tail;
	
	public LinkedList() {
	}
	
	public void add(int data) {
		if(head==null) {
			head = new Node(data);
			tail=head;
			return;
		}
		
		tail.next=new Node(data);
		tail=tail.next;
	}

	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
}
