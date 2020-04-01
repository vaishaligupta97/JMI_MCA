import java.util.*;
class Matrix
{
	int row,col;
//	int a[][]=new int[row][col];
	int a[][];
	
	Matrix(int row,int col)
	{ 
		//row=0;
		//col=0;
		
	 //int a[][]=new int[row][col];
	 Scanner sc=new Scanner(System.in);
	 int a[][]=new int[row][col];
		System.out.println("Enter the matrix");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j]=sc.nextInt();
	}

/*	void input()
	{
		
	}*/
			
/*	Matrix matAddition(Matrix m)
	{
		Matrix m3=new Matrix();
		if(row==m.row && col==m.col)
		{
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					m3.a[i][j]=a[i][j]+m.a[i][j];
			
		}
		else
		{
			System.out.println("Matrix Addition not possible");
		}
		return m3;
	}	*/	
			
/*	Matrix matProduct(Matrix m)
	{
		if(col!=m.row)
		{
			System.out.println("Matrix product not possible");
		}
		else
		{
			Matrix m3=new Matrix();
			for(int i=0;i<row;i++)
				for(int j=0;j<m.col;j++)
				{
					m3.a[i][j]=0;
					for(int k=0;k<col;k++)
						m3.a[i][j]+=a[i][k]*m.a[k][j];
				}
			return m3;
		}
	}*/

	void matPrint()
	{
		System.out.println("hello");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
	}
}
class MatOperation
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and cols");
		int row=sc.nextInt();
		int col=sc.nextInt();
		Matrix m1=new Matrix(row,col);
	//	m1.input();
	//	Matrix m2=new Matrix();
	//	m2.input();
		m1.matPrint();
	//	m2.matPrint();
	//	Matrix m3=m1.matAddition(m2);
	//	m3.matPrint();
	//	Matrix m3=m1.matProduct(m2);
	//	m3.matPrint();
	}
}
		
	