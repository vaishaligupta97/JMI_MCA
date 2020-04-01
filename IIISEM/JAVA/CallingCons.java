class A
{
	A()
	{
		System.out.println("Inside A's constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Inside B's constructor");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Inside c's constructor");
	}
}
class CallingCons
{
	public static void main(String args[])
	{
		C c =new C();				//constructors are called from base class to derived class.
	}
}