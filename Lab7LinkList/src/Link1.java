import java.util.LinkedList;
import java.util.ListIterator;

public class Link1 {

	public String ele;
	
	
	public Link1 next; //next link in the list
	
	public Link1(String ele) //Constructor
	{
		this.ele = ele;
		
	}

	
	public void display() //display method
	{
		System.out.println(ele);
	}
	
	public String toString()
	{
		return ele;
	}


	
	public static void main(String[] args)
	{

		LinkList LL1 = new LinkList();
		LinkList LL2 = new LinkList();
	
		LL1.insertFirstLink ("Tulsa");
		LL1.insertFirstLink ("OKC");
		LL1.insertFirstLink ("Broken Arrow");
		LL1.insertFirstLink ("Owasso");
		LL1.insertFirstLink ("Ada");
		
		LL2.insertFirstLink ("74104");
		LL2.insertFirstLink ("74135");
		LL2.insertFirstLink ("foo");
		LL2.insertFirstLink ("hello world");
		LL2.insertFirstLink ("777");
		
		System.out.println(LL1);
	}


}

class LinkList
{
	public Link1 firstLink; // first link in the list
	
	LinkList()
	{
		firstLink = null; //unnecesary becasue all objects start out as null
	}


	public boolean isEmpty() //Checks to see if the link is empty
	{
		return(firstLink == null);
	}

		public void insertFirstLink(String ele) //Inserts a new node into the linked list
		{
			Link1 newLink = new Link1(ele); //Creates a new link
			
			newLink.next = firstLink;
			
			firstLink = newLink;
		
		}
	
		public Link1 removeFirst() //Removes the first node in a linked list
		{
			Link1 linkReference = firstLink;
			
			if (!isEmpty())
			{
				firstLink = firstLink.next;
			} else {
				System.out.println("Empty LinkedList");
			}
			
			return linkReference;
			
		}
		
		public void display() //Will display the linked list
		{
			Link1 theLink = firstLink;
			
			while(theLink != null) //checks to see if you have reachched the end of the list
			{
				theLink.display();
				
				System.out.println("Next Link: " + theLink.next);
				
				theLink = theLink.next;
				
				System.out.println();
			}
		}
		
		public Link1 find(String ele)
		{
			Link1 theLink = firstLink;
			
			if (!isEmpty())
			{
				while (theLink.ele != ele)
				{
					if (theLink.next == null) 
					{
			
					} else {
						theLink = theLink.next;
					}
				}
			} else {
				System.out.println("Empty LinkedList");
			}
			
			return theLink;
		}
		
		public Link1 removeLink (String ele) 
		{
			Link1 currentLink = firstLink;
			Link1 previousLink = firstLink;
			
			while (currentLink.ele != ele)
			{
				if (currentLink.next == null)
				{
					return null;
				} else {
					
					previousLink = currentLink;
					
					currentLink = currentLink.next;
					
					
				}
			}
			
			if (currentLink == firstLink)
			{
				firstLink = firstLink.next;
				
			} else {
				
				previousLink.next = currentLink.next;
			}
			
			return currentLink;
		}
		
}
