package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll =new LinkedList();
		ll.add(9);
		ll.add(9);
		ll.add(9);
		ll.add(9);
		
		LinkedList ll1= addOneToLL(ll);
		ll1.printList();
	}
	
	public static LinkedList addOneToLL(LinkedList linkedList) {
		Node head=linkedList.head;
		if(head==null) return linkedList;
		int carry=addOneToLLHelper(head);
		if(carry==1) {
			Node node=new Node(1);
			node.next=linkedList.head;
			linkedList.head=node;
		}
		return linkedList;
	}

	private static int addOneToLLHelper(Node head) {
		if(head.next==null) {
			int sum=head.data+1;
			int carry= sum/10;
			sum=sum%10;
			head.data=sum;
			return carry;
		}
		
		int carry= addOneToLLHelper(head.next);
		int sum=(head.data+carry);
		carry=(sum/10);
		head.data=sum%10;
		return carry;
	}

}
