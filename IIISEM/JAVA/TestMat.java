import java.util.*;

class Mat<T>
{
	int row,col;
	T a[][];
	
	Mat() {}
	
	Mat(T[][] data,int r,int c)
	{
			a=data;
			row=r;
			col=c;
	}
	
	void matGenerate(T[][] data)
	{
		Random rd=new Random();
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j]=rd.nextInt();
	}
	
	public String toString()
	{
		String s=" ";
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				s+= a[i][j] + " ";
			s+="\n";
		}
		return s;
	}
}
class TestMat
{
	public static void main(String args[])
	{
		Integer[][] data=new Integer[3][4];
		Mat<Integer> m1=new Mat<Integer>(data,3,4);
		m1.matGenerate(data);
		System.out.println(m1);
	}
}