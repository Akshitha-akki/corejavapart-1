package corejavapart_1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Spliterators;
public class Hash_Table_collection {

	public static void main(String[] args) 
	{	
		Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
		//Empty method

		System.out.println(ht.isEmpty());
		//Put method
		ht.put(1,"A");
		ht.put(2,"B");
		ht.put(3,"C");
		ht.put(4,"D");
		System.out.println("Elements in HashTable : "+ht);
		//ContainsKeys
		System.out.println("Containskeys : "+ht.containsKey(2));
		//ContainsValues
		System.out.println("ContainsValues : "+ht.containsValue("A"));
		//Replace
		ht.replace(3,"S");
		System.out.println(ht);
		//Replace old String with new String
		ht.replace(4, "D", "R");
		System.out.println(ht);
	}

}
