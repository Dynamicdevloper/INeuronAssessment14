package in.ineuron;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(1);
	    Node node2 = new Node(2);
	    Node node3 = new Node(-3);
	    Node node4 = new Node(3);
	    Node node5 = new Node(1);
	    head.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    node4.next = node5;

	    
	    Node result = removeZeroSumSublists(head);

	    Node current = result;
	    while (current != null) {
	        System.out.println(current.data);
	        current = current.next;
	    }

	}
	
	 public static Node removeZeroSumSublists(Node head) {
	        Node dummy = new Node(0);
	        dummy.next = head;

	        Node current = dummy;
	        int prefixSum = 0;
	        Map<Integer, Node> map = new HashMap<>();

	        // Compute the running sum and store the last occurrence of each sum
	        while (current != null) {
	            prefixSum += current.data;
	            map.put(prefixSum, current);
	            current = current.next;
	        }

	        // Reset current to dummy head and compute the running sum again
	        current = dummy;
	        prefixSum = 0;

	        // Traverse the list and remove nodes between same sums
	        while (current != null) {
	            prefixSum += current.data;
	            current.next = map.get(prefixSum).next;
	            current = current.next;
	        }

	        return dummy.next;
	    }
	}
