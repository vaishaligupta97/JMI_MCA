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
	
	boolean isconnected()
	{	
		int flag=0;
		int d[][]=new int[v][v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				d[i][j]=a[i][j];
					
			for(int k=0;k<v;k++)
				for(int i=0;i<v;i++)
					for(int j=0;j<v;j++)
					{
						if(d[i][k]==1 && d[k][j]==1)
							d[i][j]=1;
					}
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
	void display()
	{
		System.out.println("Adjacency matrix is");
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class DirectedGraph extends Graph
{
	DirectedGraph()
	{}
	void indegree()
	{
		int degi[]=new int[v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				degi[i]+=a[j][i];
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
		for(int i=0;i<v;i++)
		{
			System.out.println("dego[" + i+"] "+dego[i]);
		}
	}	
	
}
class WeightedGraph extends Graph
{
	WeightedGraph()
	{
	}
	void shortest_path()
	{
		System.out.println("hello");
		int d[][]=new int[v][v];
		for(int i=0;i<v;i++)
				for(int j=0;j<v;j++)
					d[i][j]=a[i][j];

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
		System.out.println("Shortest path matrix");
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
class GraphTest2
{
	public static void main(String args[])
	{
		Graph g=new Graph();
		WeightedGraph wg=new WeightedGraph();
		DirectedGraph dg=new DirectedGraph();
		dg.input();
		boolean ans=dg.isconnected();
		if(ans==true)
			System.out.println("Graph is connected");
		else
			System.out.println("Graph is not connected");
	
		dg.indegree();
		dg.outdegree();
		
		wg.input();
		wg.shortest_path();
		wg.display();
	}
}
	