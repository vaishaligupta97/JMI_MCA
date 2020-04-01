abstract class A			//Any class that has abstract method must be declared as abstract.
{
	abstract void callme();
	
	void callmetoo()
	{
		System.out.println("This is a concrete method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("B's implementation of callme");
	}
}
class AbstractionDemo
{
	public static void main(String args[])
	{
	//	A a=new A();		//error!!...A can not be instantiated as class A is abstract.
		B b=new B();
		b.callme();
		b.callmetoo();
	}
}