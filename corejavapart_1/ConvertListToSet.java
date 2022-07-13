package corejavapart_1;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(90);
		list.add(6);
		list.add(1);
		list.add(70);
		System.out.println("List : "+list);
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println("Set : "+set);
    }
}
