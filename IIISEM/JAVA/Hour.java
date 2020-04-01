import java.util.*;

class Hour
{
	public static void main(String args[])
	{
		int a[][]=new int[5][5];
		System.out.println("Enter the matrix");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				a[i][j]=sc.nextInt();
		
		System.out.println("Entered matrix is");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("All glass hour is");
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				for(int k=i;k<=(i+2);k++)
				{
					//	cout<<"k= "<<k<<" ";
					for(int l=j;l<=(j+2);l++)
					//	System.out.println("l= "+l +" ");
						System.out.print(a[k][l] + "\t");
					System.out.println();
				}
	}
}