import java.util.*;

class Mat
{
	int row,col;
	int a[][];
	
	Mat()
	{
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
	}
		
	Mat(int row,int col)
	{
		this.row=row;
		this.col=col;
		a=new int[this.row][this.col];
	}
	void input()
	{
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j]=sc.nextInt();
	}
	void print()
	{
		System.out.println("Matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}
class MatOp1
{
	public static void main(String args[])
	{
	/*	Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt(); */
		Mat m1=new Mat(2,2);
	//	Mat m2=new Mat(r,c);
	//	m2.input();
	//	m2.print();
		m1.input();
		m1.print();
		Mat m3=new Mat();
		m3.input();
		m3.print();
	}
}
				