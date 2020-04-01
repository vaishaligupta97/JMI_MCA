class A
{
	int i;
	private int j;
}
class B extends A
{
	int i;  				//this i hides the i in A
	void set()
	{
		super.i=10;			//super is used when member name of subclass hides member name of superclass ,in this case i is that member.
		super.j=30;   		// error!!... j is not accessible in subclass B as j is private in A.
		i=20;
	}
	
	void display()
	{
		System.out.println("i in superclass A= " + super.i);
		System.out.println("i in subclass B= " + i);
	}
}
class UseSuper2
{
	public static void main(String args[])
	{
		B subob=new B(); 
		subob.set();
		subob.display();
	}
}
	