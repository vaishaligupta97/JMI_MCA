class Test
{
	int a=5;			//default access
	public int b=6;		//public Access
	private int c;		//private Access
	
	void setc(int c1)
	{
		c=c1;
	}
	int getc()
	{
		return c;
	}
}
class AccessTest
{
	public static void main(String args[])
	{
		Test ob=new Test();
		ob.a=50;   //ok..because a is default access which is public by default in its package.
		System.out.println("a= "+ob.a);
		System.out.println("b= "+ob.b);
	//	ob.c=100; //error
		ob.setc(8);
		
	//	System.out.println("c= "+ob.c); //error !! can not access c directly because c is private.
		
		System.out.println("c= "+ob.getc());
	}
}