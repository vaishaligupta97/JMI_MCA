import java.util.*;

class Shared 
{
	int mutex=1;
	int rc=0;
	int db=1;
}

class Reader extends Shared implements Runnable
{
	public void run()
	{
		if(mutex==1)
			mutex--;
		rc++;
		if(rc==1)
			db--;
		mutex++;
		
		System.out.println("reader is reading data");
		
		//exit code
		mutex--;
		rc--;
		if(rc==0)
			db++;
		mutex++;
	}
}
class Writer extends Shared implements Runnable
{
	public void run()
	{
		db--;
		System.out.println("Writer is writing data");
		db++;
	}
}
class RWTest
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new Reader());
		Thread t2=new Thread(new Writer());
		t1.start();
		t2.start();
	}
}

		