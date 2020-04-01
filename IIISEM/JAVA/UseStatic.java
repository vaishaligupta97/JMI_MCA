class UseStatic
{
	static int a=3;
	static int b;
	int c=9;
	
	static void display()
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	//	System.out.println("c= "+c);  //error!! non-static variable can not be referenced in  a static method.
	}
	
	void displayc()
	{
		System.out.println("c= "+c);
	}
	
	static
	{
		b=a*4;
	}
	
	public static void main(String args[])
	{
		UseStatic ob=new UseStatic();
	//	display();			//it is ok.
	//	displayc();			//error!!...because displayc() is a non-static method..static method can not call it.
		ob.displayc();
		UseStatic.display();  //static method can be called using only classname ...not through object.
	}
}