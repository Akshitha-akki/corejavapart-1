package corejavapart_1;

import java.util.HashSet;
import java.util.Set;
public class Set_Operation 
{
	public static void main(String[] args)
	{
	    //Set -1
		Set<Integer> set1=new HashSet<Integer>();
		//Set -2
		Set<Integer> set2=new HashSet<Integer>();
		//Adding of elements in set -1
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		set1.add(70);
		//Adding of elements in set -2
		set2.add(20);
		set2.add(60);
		set2.add(80);
		System.out.println("Set-1 :"+set1);
		System.out.println("Set- :"+set2);
		// Set Operation
		//UNION OPERATION -addAll
		Set<Integer> union =new HashSet<Integer>(set1);
		union.addAll(set2);
		set1.addAll(set2);
		System.out.println("Union :"+union);
		
		//INTERSECTION OPERATION
		Set<Integer> intersection =new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection :"+intersection);
		
		//DIFFERENCE OPERATION
		Set<Integer> difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("Difference :"+difference);
		
		//SUBSET
		Set<Integer> subset=new HashSet<Integer>(set1);
		subset.containsAll(set2);
		System.out.println("Subset :"+subset);	
	}
}
