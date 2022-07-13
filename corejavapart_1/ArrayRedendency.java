package corejavapart_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRedendency 
{
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(10);
		a.add(16);
		a.add(1);
		a.add(4);
		List<Integer> newArrayList=a.stream().distinct().collect(Collectors.toList());
		System.out.println("Arraylist : "+a);
		System.out.println("New ArrayList : "+newArrayList);	
	}
}
