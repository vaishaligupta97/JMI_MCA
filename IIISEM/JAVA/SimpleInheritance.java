class A
{
	int i,j;
	private int z;
	void showij()
	{
		System.out.println("i and j and z = " + i +"  "+j +" " +z);
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k= "+k);
	}
	void sum()
	{
		System.out.println("i +j +k= " +(i+j+k));
	}
/*	void sumijkz()
	{
		System.out.println("i +j +k +z= " +(i+j+k+z));  //error!!..z is not accessible from here as z is private member.
	}*/
}
class SimpleInheritance
{
	public static void main(String args[])
	{
		A superob=new A();
		B subob=new B();
		
		superob.i=20;
		superob.j=30;
	///	superob.z=40;	//z has private access in A..not accessible from any other class .
		superob.showij();
		//subclass has access to all public members of its  superclass.
		subob.i=100;
		subob.j=200;
		subob.k=300;
	//	subob.z=400;  //not accessible as z is private member.
		subob.showij();
		subob.showk();
		subob.sum();
	//	subob.sumijkz();
	}
}