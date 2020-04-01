import java.util.*;

class Graph
{
	int v;
	int a[][];
	
	Graph()
	{}
	Graph(int v)
	{
		this.v=v;
		System.out.println("v= "+v);
		a=new int[this.v][this.v];
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		v=sc.nextInt();
		a=new int[this.v][this.v];
		System.out.println("Enter the adjacency matrix");
		int inf=Integer.MAX_VALUE;
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void indegree()
	{
		int degi[]=new int[v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				degi[i]+=a[j][i];
	//	return degi;
		for(int i=0;i<v;i++)
		{
			System.out.println("degi[" + i+"] "+degi[i]);
		}
	}
	void outdegree()
	{
		int dego[]=new int[v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				dego[i]+=a[i][j];
	//	return dego;
		for(int i=0;i<v;i++)
		{
			System.out.println("dego[" + i+"] "+dego[i]);
		}
	}	
	void display()
	{
		System.out.println("Adjacency matrix is");
		for(int i=0;i<v;i++)
		{
		//	System.out.println("hello");
			for(int j=0;j<v;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	boolean isconnected()
	{	
		int flag=0;
		int d[][]=new int[v][v];
		d=a;
			for(int k=0;k<v;k++)
			{
				for(int i=0;i<v;i++)
				{
					for(int j=0;j<v;j++)
					{
						if(d[i][k]==1 && d[k][j]==1)
							d[i][j]=1;
					}
				}
			}
	/*	for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}*/
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				if(d[i][j]==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==1)
			return false;
		else
			return true;
					
	}
	void shortest_path()
	{
		int d[][]=new int[v][v];
		d=a;
		for(int k=0;k<v;k++)
		{
			for(int i=0;i<v;i++)
			{
				for(int j=0;j<v;j++)
				{
					if((d[i][k] + d[k][j])<d[i][j])
						d[i][j]=d[i][k]+d[k][j];
				}
			}
		}
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(d[i][j] +" ");
			}
			System.out.println();
		}
	}
}
class GraphTest1
{
	public static void main(String args[])
	{
		Graph g=new Graph();
		g.input();
		g.display();
		g.indegree();
		g.outdegree();
		boolean ans=g.isconnected();
		if(ans==true)
			System.out.println("Graph is connected");
		else
			System.out.println("Graph is not connected");
		g.shortest_path();
	}
}
	