abstract class Figure
{
	double dim1;
	double dim2;
	
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area for rectangle");
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area for triangle");
		return dim1*dim2/2;
	}
}
class AbstractAreas
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(2,3);
		Triangle t=new Triangle(2,4);
		Figure f;						//this is ok..no object is created..only a reference is created.
		f=r;
		
		System.out.println("area is "+ f.area());
		f=t;
		System.out.println("area is "+ f.area());
	}
}