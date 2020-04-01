import java.util.*;
class Matrix
{
	static int a[];
	public static int n;
	static
	{
		a=new int[Matrix.n];
		System.out.println(Matrix.n);
		for(int i=0;i<Matrix.n;i++)
		{
			a[i]=i+1;
			System.out.println(a[i]);
		}
	}
}
class Check
{
		public static void main(String args[])
		{
			Matrix.n=5;
			Matrix m1=new Matrix();
			Matrix m2=new Matrix();
			Matrix m3=new Matrix();
		}
}
			
	