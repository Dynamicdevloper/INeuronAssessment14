package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
	    Node node2 = new Node(2);
	    Node node3 = new Node(3);
	    Node node4 = new Node(4);
	    Node node5 = new Node(5);
	    head.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;

	    
	    Node reorderedHead = oddEvenList(head);

	    Node current = reorderedHead;
	    while (current != null) {
	        System.out.print(current.data+"--->");
	        current = current.next;
	    }

	}
	public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddHead = head;
        Node evenHead = head.next;
        Node oddTail = oddHead;
        Node evenTail = evenHead;

        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = oddTail.next;
            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        }

        oddTail.next = evenHead;
        return oddHead;

	}

}

