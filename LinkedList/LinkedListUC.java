package linkedlist;
// class for creating node
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}

//Linked list class to perform all CRUD operations
class LinkList
{
	Node head;
//	Method for Printing elements in a linkedlist 
	void printLinkedList()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}	
		System.out.println();
	}
//	Method for adding element at starting of a linkedlist
	void addFirst(int element)
	{
		Node temp=new Node(element);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
//	Method for adding element to linkedlist at rare-end
	void add(int element)
	{
		Node temp=new Node(element);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
//	Method for adding element at a given linkedlist
	void add(int index,int element)
	{
		Node temp=new Node(element);
		if(index==0)
		{
			head=temp;
		}
		else
		{
			Node curr=head;
			int count=0;
			while(count<index-1)
			{
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
		}
	}
//	removing element at front-end  from linkedlist
	void pop()
	{
		if(head==null)
		{
			
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node curr=head;
			head=curr.next;
			curr.next=null;
		}
	}
//	removing element from the rare-end of linkedlist
	void removeLast()
	{
		if(head==null)
		{
			
		}
		else if(head.next==null)
		{
			head=null;
		}
		else if(head.next!=null)
		{
			Node curr=head;
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
		}
	}
//	searching for element
	void search(int element)
	{
		Node curr=head;
		while(curr!=null)
		{
			if(curr.data==element)
			{
				System.out.println("Key found");
				return;
			}
			curr=curr.next;
		}
		System.out.println("Key not found");
	}
//	Inserting element at a given index
	void insert(int key,int element)
	{
		Node temp=new Node(element);
		Node curr=head;
		while(curr!=null)
		{
			if(curr.data==key)
			{
				temp.next=curr.next;
				curr.next=temp;
				return;
			}
			curr=curr.next;
		}
		
	}
//	Method for removing a given element 
	void  removeElement(int element)
	{
		Node curr=head;
		while(curr!=null)
		{
			if(curr.next.data==element)
			{
				curr.next=curr.next.next;
				break;
			}
			curr=curr.next;
		}
	}
//	Method for finding Size
	void size()
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		System.out.println(count);
	}
//	Method for sorting a linkedlist
	void sortAdd(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		if(data<head.data)
		{
			temp.next=head;
			head=temp;
			return;
		}
		Node curr=head;
		while(curr.next!=null && data>curr.next.data)
		{
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
	}
	
}
//Main class
public class LinkedListUC {

	public static void main(String[] args) {
		LinkList ll=new LinkList();
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(70);
		ll.printLinkedList();

	}

}
