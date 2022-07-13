package corejavapart_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class InputCollection {

	public static void main(String[] args) {
		//ArrayList
				ArrayList<Integer> list= new ArrayList<Integer>();
				Scanner scan=new Scanner(System.in);
				//Size
				System.out.println("Enter the size :");
				Integer size=scan.nextInt();
				//Number of elements entering into the ArrayList
				System.out.println("Enter the integers : ");
				for(Integer i=0;i<size;i++)
				{
					list.add(scan.nextInt());
				}
				//Printing the ArrayList
				//Getting the output by using the iterator
				Iterator<Integer> iter=list.iterator();
				while(iter.hasNext())
				{
					System.out.print(iter.next()+" ");
				}
				System.out.println();
				//Getting the output 
				System.out.println("Integer  : "+list);
				scan.close();
	}

}
