package corejavapart_1;

import java.util.ArrayList;
import java.util.Scanner;
class CollectionClass
{
	public ArrayList<Integer> Names;
	void getData(ArrayList<Integer> names)
	{
		this.Names=names;   
	}
	void Display()
	{
		System.out.println("Names : "+Names);
	}
}
public class Class_collections extends CollectionClass
{
	public static void main(String[] args) 
	{
		//ArrayList
		ArrayList<Integer> names= new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		//Creating the object
		CollectionClass obj=new CollectionClass();
		//Entering the size
		System.out.println("Enter the size :");
		Integer size=scan.nextInt();
		//Number of elements entering into the ArrayList
		System.out.println("Enter the integers : ");
		for(Integer i=0;i<size;i++)
		{
			names.add(scan.nextInt());
		}
		obj.getData(names);
		obj.Display();
		scan.close();
	}
}
