package in.ineuron;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Node head = new Node(2);
		    Node node2 = new Node(1);
		    Node node3 = new Node(5);
		    head.next = node2;
		    node2.next = node3;

		    
		    int[] result = nextLargerNodes(head);

		    System.out.println(Arrays.toString(result));

	}
	
	 public static int[] nextLargerNodes(Node head) {
	        // Convert the linked list to an array
	        List<Integer> dataues = new ArrayList<>();
	        Node current = head;
	        while (current != null) {
	            dataues.add(current.data);
	            current = current.next;
	        }

	        int[] result = new int[dataues.size()];
	        Stack<Integer> stack = new Stack<>();

	        // Iterate through the array to find the next greater nodes
	        for (int i = 0; i < dataues.size(); i++) {
	            while (!stack.isEmpty() && dataues.get(i) > dataues.get(stack.peek())) {
	                result[stack.pop()] = dataues.get(i);
	            }
	            stack.push(i);
	        }

	        return result;
	    }

}
