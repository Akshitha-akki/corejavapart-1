package corejavapart_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
public class Even_Odd 
{
	public static void main(String[] args) 
	{
		       //Set -1
				Set<Integer> set1=new HashSet<Integer>();
				//Adding of elements in set -1
				set1.add(10);
				set1.add(3);
				set1.add(30);
				set1.add(47);
				set1.add(50);
				set1.add(69);
				set1.add(72);
				System.out.println("Set-1 :"+set1);
			//Using the ForEach loop
				System.out.print("Even : ");
				for(Integer set: set1)
				{
					if(set%2==0)
					{
						System.out.print(set+" ");
					}
				}
				System.out.println();
			//Using the Iterator
				System.out.print("odd  : ");
				Iterator<Integer> iter=set1.iterator();
				while(iter.hasNext())
				{
					Integer i=iter.next();
					if(i%2 != 0)
					{
						System.out.print(i+" ");
					}
				}
				System.out.println();
			//Using the Stream class
				System.out.print("Even : ");
				Set<Integer> s=set1.stream().filter(o->o%2==0).collect(Collectors.toSet());
				System.out.print(s+" ");
	}
}
