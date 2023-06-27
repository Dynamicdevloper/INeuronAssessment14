package in.ineuron;

public class Question6 {

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

		    int k = 2;

		    
		    Node shiftedHead = leftShift(head, k);

		    Node current = shiftedHead;
		    while (current != null) {
		        System.out.println(current.data);
		        current = current.next;
		    }

	}
	
	public static Node leftShift(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Normalize k to be within the range of the list length
        k = k % length;

        if (k == 0) {
            return head; // No need to shift
        }

        // Find the new head and tail after left shifting
        Node newHead = head;
        Node newTail = null;
        current = head;
        int count = 0;
        while (count < k) {
            newTail = current;
            current = current.next;
            count++;
        }
        newHead = current;

        // Move to the end of the list
        while (current.next != null) {
            current = current.next;
        }

        // Connect the new tail to the old head
        current.next = head;

        // Set the new tail's next to null
        newTail.next = null;

        return newHead;

	}
}
