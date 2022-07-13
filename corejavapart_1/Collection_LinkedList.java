package corejavapart_1;
 
//Importing the LinkedList
import java.util.LinkedList;
public class Collection_LinkedList {

	public static void main(String[] args) {
		//LinkedList for String
		LinkedList<String> s=new LinkedList<String>();
				//Add operation 
				s.add("greeen");
				s.add("Red");
				s.getClass();
				System.out.println("String in LinkedList :"+s.getClass());
				//AddFirst operation 
				s.addFirst("Blue");
				System.out.println("LinkedList :"+s);
				//AddLast operation 
				s.addLast("White");;
				System.out.println("LinkedList :"+s);
				//get operation
				//get method for single element
				System.out.println("get method in LinkedList");
				System.out.println(s.get(0));
				//All elements using get method
				for(int i=0;i<4;i++)
				{
					System.out.println(s.get(i));
				}
				//Size operation
				System.out.println("Size method in LinkedList :"+s.size());
				//Set operation  
				s.set(3, "Pink");
				System.out.println("set method in LinkedList :"+s);
				//Remove operation 
				s.remove(3);
				System.out.println("Remove method in  LinkedList :"+s);
				//RemoveAll operation  
				s.removeAll(s);
				System.out.println("RemoveAll method in  LinkedList :"+s);
				//Adding elements
				s.add("A");
				s.add("B");
				s.add("AB");
				System.out.println("Adding new elements method in  LinkedList:"+s);
				//Add(index,element) method
				//getFirst method
				s.add(0, "C");
				System.out.println("LinkedList : "+s);
				//getFirst method
				System.out.println("GetFirst in LinkedList :"+s.getFirst());
				//Clear method
				s.clear();
				System.out.println("Clear method in  LinkedList :"+s);
				
				
				
	}

}
