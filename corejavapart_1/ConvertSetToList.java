package corejavapart_1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConvertSetToList 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(5);
		set.add(8);
		set.add(70);
		set.add(50);
		set.add(10);
		System.out.println("Set : "+set);
		List<Integer> list = set.stream().collect(Collectors.toList());
		System.out.println("List : "+list);
	}
}