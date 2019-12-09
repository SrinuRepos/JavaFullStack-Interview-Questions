class Node
	{
int value;
Node next;
public Node()
{
}
public Node(int value)
{
this.value = value;
}
	}

class LinkedList
	{
Node head = null;
public LinkedList()
{
}

public void add(int value)
{
	if( head == null)
	{
	  head = new Node(value);	
	}else
	{
	Node current = head;
		while(current.next != null)
		{
		current = current.next;
		}
	 Node  newNode = new Node(value);
	current.next = newNode;
	}
}

public Node getHead()
{
return head;
}

public Node reverseList(Node head)
{
	Node current = head;
	Node prev = null;
	while(current != null)
	{
	Node temp = current.next;
	current.next = prev;
	prev = current;
	current = temp;
	
	}
return prev;
}
	}

public class LinkedListApp
	{
public static void main(String args[])
{
	LinkedList list = new LinkedList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	System.out.println(" Elements in the list");
	Node current = list.getHead();
	while( current != null)
	{
	System.out.println(current.value);
	current = current.next;
	}
	
	System.out.println(" Reversing the List");
	Node revListNode = list.reverseList(list.getHead());
	current = revListNode ;
	while( current != null)
	{
	System.out.println(current.value);
	current = current.next;
	}
	
}

	}