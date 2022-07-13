package corejavapart_1;

class Static
{
	static int Add1(int a,int b)
	{
		return (a+b);
	}
	static void Add2(int a,int b)
	{
		System.out.println("static void Add2: "+(a+b));
	}
}
public class UsingStatic {

	public static void main(String[] args) {
		int res=Static.Add1(2, 2);
		System.out.println("Using Add1 : "+res);
		//System.out.println("Using Add1 :"+Add1(2, 2));
		Static.Add2(2, 2);
	}
}
