
import java.io.*;

class Shared
{
	static Integer mutex=1;
	static Integer db=1;
	static int rc=0;
}

class Reader extends Shared implements Runnable
{
	public void run()
	{
		System.out.println("Reader Entered "+Thread.currentThread().getName());
			try
			{
				synchronized(db)
				{
					if(mutex==1)
					{
						mutex--;
						System.out.println("File available for Reading "+Thread.currentThread().getName());
					}
					else
						throw new ArithmeticException("File Cannot be Read right now "+Thread.currentThread().getName());
					rc=rc+1;
					if(rc==1)
						{
							if(db==1)
								db--;
							else
								throw new ArithmeticException("File Cannot be Read right now "+Thread.currentThread().getName());
						}
					mutex=mutex+1;
					System.out.println("Reader is reading now "+Thread.currentThread().getName());
					mutex--;
					rc--;
					if(rc==0)
						db++;
					mutex++;
					System.out.println("Reader has finshed reading "+Thread.currentThread().getName());
				}
			}
				
			catch(Exception e)
			{
				System.out.println(e.getMessage());		
			}	
	}
}
	

class Writer extends Shared implements Runnable
{

	public void run()
	{
		
		System.out.println("Writer Entered "+Thread.currentThread().getName());
		
			try
			{

				if(db==1)
				{
					db--;
					System.out.println("File available for Writing "+Thread.currentThread().getName());
				}
				else
					throw new ArithmeticException("Cannot Write now "+Thread.currentThread().getName());
					
				System.out.println("Writer is Writing now "+Thread.currentThread().getName());	
				db++;
				System.out.println("Writer has finshed writing "+Thread.currentThread().getName());
			}
			catch(Exception e)
			{
					System.out.println(e.getMessage());		
			}			
	}
}

class RWTest1
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Reader());
		Thread t2=new Thread(new Reader());
		Thread t3=new Thread(new Writer());
		Thread t4=new Thread(new Reader());
		Thread t5=new Thread(new Writer());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
