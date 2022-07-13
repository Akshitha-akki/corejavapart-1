package corejavapart_1;
 
import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Collection {

	public static void main(String[] args) {
		 //HashSet using Integer 
		 HashSet<Integer> h=new HashSet<Integer>();
		 //isEmpty
		 System.out.println("isEmpty : "+h.isEmpty());
		 //Adding of elements to set
		 h.add(0);
		 h.add(1);
		 h.add(2);
		 h.add(3);
		 System.out.println("Set : "+h);
		 System.out.println("isEmpty : "+h.isEmpty());
		 //HashCode 
		 System.out.println("HashCode : "+h.hashCode());
		 //Iterator
		 Iterator<Integer> iter=h.iterator();
		 System.out.print("Iterator : ");
		 while(iter.hasNext())
		 {
			 System.out.print(iter.next()+" ");
		 }
		 System.out.println();
		 //HashSet using String
		 HashSet<String> hs=new HashSet<String>();
		 hs.add("A");
		 hs.add("B");
		 System.out.println(hs);
		 System.out.println(hs.hashCode());
		 System.out.println("Remove : "+hs.remove("B"));
	}
}
