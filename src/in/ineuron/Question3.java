package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static Node flattenLinkedList(Node head) {
		
		if(head==null || head.next==null) return head;
		head.next=flattenLinkedList(head.next);
		head=merge(head.next,head);
		return head;
	}

	private static Node merge(Node a, Node b) {
		
		Node temp3=new Node(-1);
		Node temp4=temp3;
		Node temp1= a;
		Node temp2= b;
		while(temp1!=null && temp2!=null) {
			if(temp1.data<temp2.data) {
				Node temp=temp1.child;
				temp1.child=null;
				temp4.child=temp1;
				temp4=temp4.child;
				temp1=temp;
			}else {
				Node temp=temp2.child;
				temp2.child=null;
				temp4.child=temp2;
				temp4=temp4.child;
				temp2=temp;
			}
			
			if(temp1!=null) {
				temp4.child=temp1;
			}
			
			if(temp2!=null) {
				temp4.child=temp2;
			}
			
		}
		return temp3;
	}
}
