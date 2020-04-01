class A
{
	static int i=9;
/*	A(int i)
	{
		System.out.println("inside a");
		this.i=i;
	}*/
	static void display()
	{
		System.out.println("showing i= "+ i);		//this can not be referenced in static context.
	}
}
class B extends A
{
	static int j=5;
	static void show()
	{
		super.display();						//super can not referenced from a static context.
		System.out.println("j: "+j);
	}
}
	
class CallStatic
{
	public static void main(String args[])
	{
	//	A a=new A(5);
		B.show();
	}
}