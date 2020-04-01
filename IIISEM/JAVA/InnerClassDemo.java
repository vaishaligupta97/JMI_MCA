class Outer
{
	int outer_x=100;
	private int outer_y=200;
	static int outer_v=300;
	
	void test()
	{
		Inner inner=new Inner();		//inner class object is always created inside enclosing class.
		inner.display();
	}
	
	class Inner
	{
		int inner_z=20;
		void display()
		{
			System.out.println("member of outer class outer_x " + outer_x);
			System.out.println("member of outer class outer_y " + outer_y);
			System.out.println("member of outer class outer_v " + outer_v);
			System.out.println("member of inner class inner_z " + inner_z);
		}
	}
	
	void show_inner_z()
	{
	//	System.out.println("member of inner class inner_z " + inner_z);  //error!!...outer class member can not access inner class member.
		System.out.println("static member: "+outer_v);
	}
}
class InnerClassDemo
{
	public static void main(String args[])
	{
		Outer out=new Outer();
		//out.test();            //it is also ok.
		out.show_inner_z();
		Outer.Inner in=out.new Inner();  //if we have to made an object of inner class out of enclosing class scope.
		in.display();
	}
}
	