package corejavapart_1;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet_Collection 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//isEmpty
		System.out.println("Checking whether the set is empty or not : "+ts.isEmpty());
		ts.add(10);
		ts.add(23);
		ts.add(35);
		ts.add(44);
		System.out.println("Set : "+ts);
		//Ceiling
		System.out.println("Ceiling : "+ts.ceiling(45));
		//Higher
		System.out.println("Higher : "+ts.higher(0));
		//Descending Order
        Iterator<Integer> iter=ts.descendingIterator();  
        System.out.print("[ ");
        while(iter.hasNext())  
        {  
            System.out.print(iter.next()+" ");  
        }
        System.out.print("]");
        System.out.println();
        //floor
        System.out.println("Floor : "+ts.floor(11));
        //first
        System.out.println("First method : "+ts.first());
        //last 
        System.out.println("Last method :"+ts.last());
        //Lower
        System.out.println("Lower method"+ts.lower(10));
	}
}
