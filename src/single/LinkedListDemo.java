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
}
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(8);
		l.add(7);
		l.add(3);
		System.out.println("linkedlist");
		l.display();
		System.out.println("Size of linkedList: "+l.size);
		l.addFirst(10);
		l.addFirst(20);
		System.out.println("linkedlist");
		l.display();
		System.out.println("Size of linkedList: "+l.size);
		l.addAnyPosition(90, 3);
		System.out.println("Size of linkedList: "+l.size);
		l.display();
		l.addAnyPosition(100, l.size);
		System.out.println("linkedlist");
		l.display();
		System.out.println("Size of linkedList: "+l.size);
		System.out.println("End");
		
	}

}
