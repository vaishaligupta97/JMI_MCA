abstract class Shape
{
	abstract double findArea();
}
abstract class TwoDshape extends Shape
{
	abstract double findCircum();
}
abstract class ThreeDshape extends Shape
{
	abstract double findVolume();
}
class Triangle extends TwoDshape
{
	double a,b,c;
	Triangle(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double findCircum()
	{
		return a+b+c;
	}
	double findArea()
	{
		System.out.println("inside area of triangle");
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a) + s*(s-b) +s*(s-c));
	}
}
class Rectangle extends TwoDshape
{
	double a,b;
	Rectangle(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	double findCircum()
	{
		return a+b;
	}
	double findArea()
	{
		System.out.println("inside area of Recatangle");
		return a*b;
	}
}
class Circle extends TwoDshape
{
	final double PI=3.14;
	double r;
	Circle(int r)
	{
		this.r=r;
	}
	double findCircum()
	{
		return 2*PI*r;
	}
	double findArea()
	{
		System.out.println("inside area of Circle");
		return PI*r*r;
	}
}
class Cuboid extends ThreeDshape
{
	double l,b,h;
	Cuboid(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	double findVolume()
	{
		return l*b*h;
	}
	double findArea()
	{
		System.out.println("inside area of Cuboid");
		return (2*l*b + 2*b*h + 2*h*l);
	}
}
class Cube extends ThreeDshape
{
	double l;
	Cube(double l)
	{
		this.l=l;
	}
	double findVolume()
	{
		return l*l*l;
	}
	double findArea()
	{
		System.out.println("inside area of Cube");
		return (6*l*l);
	}
}
class AbstractShape
{
	public static void main(String args[])
	{
		Shape s;
		TwoDshape twod;
		ThreeDshape threed;
		Triangle t=new Triangle(3,4,5);
		s=t;
		System.out.println("area is "+s.findArea());
		twod=t;
		System.out.println("circumference is "+twod.findCircum());
		System.out.println();
		
		Rectangle r=new Rectangle(3,4);
		twod=r;
		System.out.println("area is "+twod.findArea());
		System.out.println("circumference is "+twod.findCircum());
		System.out.println();
		
		Circle c=new Circle(2);
		twod=c;
		System.out.println("area is "+twod.findArea());
		System.out.println("circumference is "+twod.findCircum());
		System.out.println();
		
		Cuboid cb=new Cuboid(3,4,5);
		threed=cb;
		System.out.println("area is "+threed.findArea());
		System.out.println("volume of cuboid is "+threed.findVolume());
		System.out.println();
		
		Cube cube=new Cube(2);
		threed=cube;
		System.out.println("area is "+threed.findArea());
		System.out.println("volume of cube  is "+threed.findVolume());
	}
}
	
	