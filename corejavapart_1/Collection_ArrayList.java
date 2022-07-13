package corejavapart_1;
//Importing the ArrayList
import java.util.ArrayList;

public class Collection_ArrayList {

	public static void main(String[] args) 
	{
		//ArrayList for String
		ArrayList<String> s=new ArrayList<String>();
		//Add operation in ArrayList
		s.add("Blue");
		s.add("greeen");
		s.add("Red");
		s.add("White");
		System.out.println("String in ArrayList :"+s);
		//get operation in ArrayList
		//get method for single element
		System.out.println("get method in ArrayList");
		System.out.println(s.get(0));
		//All elements using get method
		for(int i=0;i<4;i++)
		{
			System.out.println(s.get(i));
		}
		//Size operation in ArrayList
		System.out.println("Size method in ArrayList :"+s.size());
		//Set operation in ArrayList
		s.set(3, "Pink");
		System.out.println("set method in ArrayList :"+s);
		//Remove operation in ArrayList
		s.remove(3);
		System.out.println("Remove method in ArrayList :"+s);
		//RemoveAll operation in ArrayList
		s.removeAll(s);
		System.out.println("RemoveAll method in ArrayList :"+s);
		//Adding elements
		s.add("A");
		s.add("B");
		System.out.println("Adding new elements method in ArrayList :"+s);
		//Clear method in ArrayList
		s.clear();
		System.out.println("Clear method in ArrayList :"+s);
	}

}
