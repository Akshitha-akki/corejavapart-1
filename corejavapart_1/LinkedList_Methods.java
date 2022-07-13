package corejavapart_1;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class LinkedList_Methods {

	public static void main(String[] args) 
	{
		//LinkedList-1
		LinkedList<String> list1 = new LinkedList<String>();
		//AddFirst
		list1.addFirst("I");
		//Add
		list1.add("Love");
		//AddLast
		list1.add("Programming");
		list1.add("with");
		list1.addLast("Coffee");
		System.out.println("LinkedList : "+list1);
		//Contains
		System.out.println("Conatins Methond : "+list1.contains("I"));
		//LinkedList -2
		LinkedList<String> list2=new LinkedList<String>();
		//Clone
		list2=(LinkedList)list1.clone();
		System.out.println("Clone method :"+list2);
		//IndexOf
		System.out.println("IndexOf Method : "+list1.indexOf("L"));
		//IndexOfLast
		System.out.println("LastIndexOf : "+list1.lastIndexOf("with"));
		//romoveFirst
		System.out.println("RomoveFirst Method : "+list1.removeFirst());
		//removeLast
		System.out.println("RemoveFirst method : "+list1.removeLast());
		System.out.println(list1);
		//Collection
		Collection<String> collection =new ArrayList();
	    collection.add("And");
		collection.add("I");
	    collection.add("Love");
	    collection.add("Music");
	    //AddAll
	    list2.addAll(collection);
	    System.out.println(list2);
	    //iterator
	    Iterator<String> iterator=list2.iterator();
	    System.out.println("Iterator");
	    while(iterator.hasNext())
	    {
	    	System.out.print(iterator.next()+" ");
	    }
	}

}
