final class A
{
	final void meth()
	{
		System.out.println("This is a final method");
	}
}
class B extends A					//can not inherit class A as it is final.
{
	void meth()
	{
		System.out.println("Ilegal");		//meth can not be overridedn.
	}
}
class FinalDemo
{
public static void main(String args[])
{
	B b=new B();
}
}