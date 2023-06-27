package in.ineuron;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
	
	public static void main(String[] args) {
		Node head = new Node(1);
	    Node node2 = new Node(2);
	    Node node3 = new Node(3);
	    Node node4 = new Node(4);
	    Node node5 = new Node(5);
	    head.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;
	    head.random = node3;
	    node2.random = node5;
	    node4.random = node2;
	    
	    Node copiedHead = copyRandomList(head);


	    Node current = copiedHead;
	    while (current != null) {
	        System.out.println("Value: " + current.data);
	        System.out.println("Next: " + (current.next != null ? current.next.data : "null"));
	        System.out.println("Random: " + (current.random != null ? current.random.data : "null"));
	        System.out.println();
	        current = current.next;
	    }
	}
	
	 public static Node copyRandomList(Node head) {
	        if (head == null) {
	            return null;
	        }

	        Map<Node, Node> map = new HashMap<>();

	        Node current = head;
	        while (current != null) {
	            map.put(current, new Node(current.data));
	            current = current.next;
	        }

	        
	        current = head;
	        while (current != null) {
	            Node copy = map.get(current);
	            copy.next = map.get(current.next);
	            copy.random = map.get(current.random);
	            current = current.next;
	        }

	        return map.get(head);
	    }

}
