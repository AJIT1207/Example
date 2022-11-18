package datastructure;

public class LinkedListNaveen {
	Node head;
	
	class Node
	{
		Node next;
		int data;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	public void printLinkedList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		
	}

	public static void main(String[] args) {
		LinkedListNaveen list = new LinkedListNaveen();
		Node first = list.new Node(10);
		list.head = first;
		
		Node second = list.new Node(20);
		first.next = second;
		
		Node third = list.new Node(30);
		second.next = third;
		
		list.printLinkedList();
	}

}
