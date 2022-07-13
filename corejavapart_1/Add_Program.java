package corejavapart_1;


public class Add_Program 
{
	public int add1(int a,int b)
	{
		return (a+b);
	}
	void add2(int a,int b)
	{
		System.out.println("using void add2 : "+(a+b));
	}
	static int add3(int a,int b)
	{
		return (a+b);
	}
	static void add4(int a,int b)
	{
		System.out.println("static void add4: "+(a+b));
	}
	public static void main(String[] args)
	{
		Add_Program obj=new Add_Program();
		//System.out.println("using int add1 : "+obj.add1(2, 2));
		int result=obj.add1(2, 2);
		System.out.println("using int add1 : "+result);
		obj.add2(2, 2);
		System.out.println("static int add3 : "+add3(2, 2));
		add4(2, 2);
	}
}
