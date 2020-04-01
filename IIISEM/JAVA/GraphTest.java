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
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	int* indegree()
	{
		int degi[]=new int[v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				degi[i]+=a[j][i];
		return degi;
	/*	for(int i=0;i<v;i++)
		{
			System.out.println("degi[" + i+"] "+degi[i]);
		}*/
	}
	int* outdegree()
	{
		int dego[]=new int[v];
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				dego[i]+=a[i][j];
		return dego;
	/*	for(int i=0;i<v;i++)
		{
			System.out.println("dego[" + i+"] "+dego[i]);
		}*/
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
//	bool isconnected();
}
class GraphTest
{
	public static void main(String args[])
	{
		Graph g=new Graph();
		g.input();
		g.display();
		g.indegree();
		g.outdegree();
	}
}
	