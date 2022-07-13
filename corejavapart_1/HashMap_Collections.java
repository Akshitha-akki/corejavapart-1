package corejavapart_1;

import java.util.HashMap;
import java.util.Hashtable;
public class HashMap_Collections {

	public static void main(String[] args) {
		HashMap< Integer, String> hm=new HashMap<Integer, String>();
		//System.out.println(hm.isEmpty());
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println("Elements of HashMap : "+hm);
		hm.remove(4);
		 
		//System.out.println(hm.remove(2));
		//hm.putIfAbsent(2,"B");
		System.out.println(hm.putIfAbsent(3, "C"));
		
	}

}
