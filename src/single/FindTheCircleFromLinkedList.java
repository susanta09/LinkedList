package single;

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class FindTheCircleFromLinkedList {
	public static void findCircle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				System.out.println("We finding the circle from the given linked list");
				return;
			}
		}
		System.out.println("Circle is not present in given linked list");
	}
	public static void findSstangPointOfCircle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				slow=head;
				while(slow!=fast)
				{
					slow=slow.next;
					fast=fast.next;
				}
				System.out.println("Stating point is "+slow.data);
				return;
			}
		}
	}
	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		Node temp=n1;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
//		 temp=n1;
//		while(temp!=null)
//		{
//			System.out.print(temp.data+"->");
//			temp=temp.next;
//		}
		System.out.println();
		n6.next=n3;
		findCircle(n1);
		findSstangPointOfCircle(n1);
		
	}

}
