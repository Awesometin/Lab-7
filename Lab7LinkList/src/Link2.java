import java.util.LinkedList;
import java.util.ListIterator;


public class Link2 {

	
	
	
	public static void main (String[] args)
	{
		
		LinkedList<String> l1 = new LinkedList<String>();
		LinkedList<String> l2 = new LinkedList<String>();
		
		
		l1.add("Tulsa");
		l1.add("OKC");
		l1.add("Ada");
		l1.add("Broken Arrow");
		l1.add("Owasso");
		
		l2.add("74104");
		l2.add("74135");
		l2.add("foo");
		l2.add("hello world");
		l2.add("777");
		
	  
		
		ListIterator<String> l1Iterator = l1.listIterator();
		String theNext = l1Iterator.next();
		String theNextNext = l1Iterator.next();
		l1Iterator.next();
		//l1.remove(index)
		
		
		
		
		int ix = 0;
		while ( ix <l1.size())
		{
			l1.element();
			l1Iterator.next();
			l1.remove();
			
			ix++;
		}
		
		
		System.out.println(l1);
		
		
	}
	
	
	
}
