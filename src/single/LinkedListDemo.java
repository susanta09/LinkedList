package single;

class LinkedList{
	Node head;
	int size;
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
	public  void add(int data)
	{
		Node nN=new Node(data);
		if(head==null)
		{
			head=nN;
			size++;
		}else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nN;
			size++;
		}
		
	}
	public void addFirst(int data)
	{
		Node nN=new Node(data);
		if(head==null)
		{
			head=nN;
			size++;
		}else {
			Node temp=head;
			nN.next=temp;
			head=nN;
			size++;
		}
	}
	public void addAnyPosition(int data,int p)
	{
		Node nN=new Node(data);
		if(p>size||p<1)
		{
			System.out.println("Invalid position");
			return;
		}else if(p==1){
			Node temp=head;
			nN.next=temp;
			head=nN;
			size++;
		}else {
			int i=1;
			Node temp=head;
			Node pre=null;
			while(i!=p)
			{
				pre=temp;
				temp=temp.next;
				i++;
			}
			nN.next=temp;
			pre.next=nN;
			size++;
		}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}

	}
	public void removeFirst()
	{
		if(head==null)
		{
			System.out.println("Linked list was Empty");
			return;
		}
		Node temp=head.next;
		size--;
		System.out.println("Removal First Element: "+head.data+" And after removed  first the Element Size: "+size);
		head=temp;	 
	}
	public void removeLast()
	{
		if(head==null)
		{
			System.out.println("Linked list was Empty");
			return;
		}
		Node temp=head;
		Node pre=null;
		while(temp.next!=null)
		{
			pre=temp;
			temp=temp.next;
		}
//		System.err.println(pre.data);
		pre.next=null;
		size--;
		System.out.println("Removal Last Element: "+temp.data+" And after removed  Last the Element Size: "+size);	
	}
	public void removeAnyPosition(int p)
	{
		if(head==null)
		{
			System.out.println("Linked list was Empty");
			return;
		}
		if(p==1)
		{
			Node temp=head.next;
			size--;
			System.out.println("Removal "+p+"TH Element: "+head.data+" And after removed  Last the Element Size: "+size);
			head=temp;
		}else if(size==p) {
			Node temp=head;
			Node pre=null;
			while(temp.next!=null)
			{
				pre=temp;
				temp=temp.next;
			}
			pre.next=null;
			size--;
			System.out.println("Removal "+p+"TH Element: "+temp.data+" And after removed  Last the Element Size: "+size);	
		}else {
			Node temp=head;
			Node pre=null;
			int i=1;
			while(i!=p)
			{
				i++;
				pre=temp;
				temp=temp.next;
			}
//			System.out.println(pre.data);
//			System.err.println(temp.data);
			pre.next=temp.next;
			size--;
			System.out.println("Removal "+p+"TH Element: "+temp.data+" And after removed  Last the Element Size: "+size);	
		}
		
	}
}

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(8);
		l.add(7);
		l.add(3);
//		System.out.println("linkedlist");
//		l.display();
//		System.out.println("Size of linkedList: "+l.size);
//		l.addFirst(10);
//		l.addFirst(20);
//		System.out.println("linkedlist");
//		l.display();
//		System.out.println("Size of linkedList: "+l.size);
//		l.addAnyPosition(90, 3);
//		System.out.println("Size of linkedList: "+l.size);
//		l.display();
//		l.addAnyPosition(100, l.size);
//		System.out.println("linkedlist");
//		l.display();
//		System.out.println("Size of linkedList: "+l.size);
//		System.out.println("End");
		System.out.println("Size of linkedList: "+l.size);
		l.display();
//		System.out.println("Size of linkedList: "+l.size);
//		l.removeFirst();
//		l.removeFirst();
//		l.display();
//		l.removeLast();
		l.removeAnyPosition(3);
		System.out.println("linkedlist");
		l.display();
		
		
	}

}
