class Box
{
	private double width;
	private double height;
	private double depth;
	
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	
	Box(double len)
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return width*height*depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	
	BoxWeight(BoxWeight ob)    // BoxWeight object is passed to Box object in constructor of super class but it will work because 
	{							//superclass variable Box ob can reference to subclass object that is boxweight object.
		super(ob);
		weight=ob.weight;
	}
	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);			//super is used to call superclass constructor.
		weight=m;
	}
	
	BoxWeight()
	{
		super();
		weight=-1;
	}
	BoxWeight(double len,double m)
	{
		super(len);
		weight=m;
	}
}
class DemoSuper
{
	public static void main(String args[])
	{
		BoxWeight mybox1=new BoxWeight(2,3,4,5);
		BoxWeight mybox2=new BoxWeight();
		BoxWeight mybox3=new BoxWeight(2,6);
		BoxWeight myclone=new BoxWeight(mybox1);
		
		System.out.println("volume of mybox1 "+mybox1.volume());
		System.out.println("weight of mybox1= "+mybox1.weight);
		
		System.out.println("volume of mybox2= "+mybox2.volume());
		System.out.println("weight of mybox2= "+mybox2.weight);
		
		System.out.println("volume of mybox3 "+mybox3.volume());
		System.out.println("weight of mybox3= "+mybox3.weight);
		
		System.out.println("volume of myclone "+myclone.volume());
		System.out.println("weight of myclone= "+myclone.weight);
	}
}	
		