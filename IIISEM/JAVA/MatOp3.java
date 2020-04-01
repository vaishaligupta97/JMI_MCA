import java.util.*;

class Mat
{
	int row,col;
	int a[][];
	static int i=1;
	
	Mat()
	{
		/*row=0;
		col=0;
		a=new int[row][col];*/
	}
	
/*	Mat()
	{
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
	}*/
		
	Mat(int row,int col)
	{
		this.row=row;
		this.col=col;
		a=new int[this.row][this.col];
	} 
	void input()
	{	
	//	static int i=1;
		System.out.println("Enter the no of rows and cols of matrix " + i);
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		i++;
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
	//	if(row==m.row && col==m.col)
	//	{
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					m3.a[i][j]=a[i][j]+m.a[i][j];
			
	//	}
		/*else
		{
			System.out.println("Matrix Addition not possible");
		}*/
		return m3;
	}
	Mat matProduct(Mat m)
	{
		Mat m3=new Mat(row,m.col);
	/*	if(col!=m.row)
			System.out.println("Matrix product not possible");
		else
		{ */
			for(int i=0;i<row;i++)
				for(int j=0;j<m.col;j++)
				{
					m3.a[i][j]=0;
					for(int k=0;k<col;k++)
						m3.a[i][j]+=a[i][k]*m.a[k][j];
				}
	//	}
		return m3;
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
class MatOp3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	/*	int r=sc.nextInt();
		int c=sc.nextInt(); */
	//	Mat m1=new Mat(2,2);
	//	Mat m2=new Mat(r,c);
	//	m2.input();
	//	m2.print();
	//	m1.input();
	//	m1.print();
	//	Mat m3=new Mat();
	//	m3.input();
	//	m3.print();
		
		Mat m1=new Mat();
		Mat m2=new Mat();
		Mat m4;
		char ch;
		do
		{
			System.out.println("1.Matrix Addition");
			System.out.println("2.Matrix product");
			System.out.println("Choose one operation");
			int a=sc.nextInt();
			switch(a)
			{
				case 1: m1.input();
						m2.input();
						if(m1.row!=m2.row || m1.col!=m2.col)
							System.out.println("Matrix Addition  is not possible");
						else
						{
							m1.matGenerate();
							m2.matGenerate();
						//	m1.print();
						//	m2.print();
							System.out.println("Matrix Addition: ");
							m4=m1.matAddition(m2);
							m4.print();
						}
						break;
				case 2: m1.input();
						m2.input();
						if(m1.col!=m2.row)
							System.out.println("Matrix product not possible");
						else
						{
							m1.matGenerate();
							m2.matGenerate();
						//	m1.print();
						//	m2.print();
							long start=System.currentTimeMillis();
							m4=m1.matProduct(m2);
							long end=System.currentTimeMillis();
							System.out.println("Time taken by product operation= " + (end-start) + " ms");
							m4.print();
						}
						break;
				default:System.out.println("Wrong choice");
			}
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
		}while(ch == 'y' || ch=='Y');
	}
}
				