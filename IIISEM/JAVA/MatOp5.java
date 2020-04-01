import java.util.*;

class Mat
{
	int row,col;
	int a[][];
	static int i=1;
	
	Mat()
	{
		System.out.println("Enter the no of rows and cols of matrix " + i);
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		i++;
	}
		
	Mat(int row,int col)
	{
		this.row=row;
		this.col=col;
		a=new int[this.row][this.col];
	} 
	void matGenerate()
	{
		Random rd=new Random();
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j]=rd.nextInt();
	}
	Mat matAddition(Mat m)
	{
		Mat m3=new Mat(row,col);
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					m3.a[i][j]=a[i][j]+m.a[i][j];
		return m3;
	}
	Mat matProduct(Mat m)
	{
		Mat m3=new Mat(row,m.col);
			for(int i=0;i<row;i++)
				for(int j=0;j<m.col;j++)
				{
					m3.a[i][j]=0;
					for(int k=0;k<col;k++)
						m3.a[i][j]+=a[i][k]*m.a[k][j];
				}
		return m3;
	}
	void print()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}
class MatOp5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Mat m5;
		char ch;
		do
		{
			System.out.println("1.Matrix Addition");
			System.out.println("2.Matrix product");
			System.out.println("Choose one operation");
			int a=sc.nextInt();
			switch(a)
			{
				case 1: Mat m1=new Mat();
						Mat m2=new Mat();
						if(m1.row!=m2.row || m1.col!=m2.col)
							System.out.println("Matrix Addition  is not possible");
						else
						{
							m1.matGenerate();
							m2.matGenerate();
						//	m1.print();
						//	m2.print();
							System.out.println("Matrix Addition:\n ");
							m5=m1.matAddition(m2);
							m5.print();
						}
						break;
				case 2: Mat m3=new Mat();
						Mat m4=new Mat();
						if(m3.col!=m4.row)
							System.out.println("Matrix product not possible");
						else
						{
							m3.matGenerate();
							m4.matGenerate();
						//	m3.print();
						//	m3.print();
							long start=System.currentTimeMillis();
							m5=m3.matProduct(m4);
							long end=System.currentTimeMillis();
							System.out.println("Time taken by product operation= " + (end-start) + " ms");
							System.out.println("Matrix product:\n ");
						//	m5.print();
						}
						break;
				default:System.out.println("Wrong choice");
			}
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
		}while(ch == 'y' || ch=='Y');
	}
}
				