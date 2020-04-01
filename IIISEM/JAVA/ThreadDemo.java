import java.math.*;

class PrimeThread extends Thread
{
	String tname;
	int n;
	PrimeThread(String name, int n)
	{
		tname=name;
		this.n=n;
	}
	
	public void run()
	{
	try{
		for(int i=1; i<=n; i++)
		{
			if(isPrime(i))
				System.out.println(tname + ": " + i);
			Thread.sleep(25);
		}
	}catch(Exception e) {}
	}
	
	private boolean isPrime(int n)
	{
		for(int i=2; i<=Math.sqrt(n); i++)
			if(n % i == 0)
				return false;
		return true;
	}
}

class FactorialThread extends Thread
{
	String tname;
	int n;
	FactorialThread(String name, int n)
	{
		tname=name;
		this.n=n;
	}
	
	public void run()
	{
	try{	
		for(int i=1; i<=n; i++)
		{
			System.out.println(tname + ": Factorial(" + i + ")=" + factorial(i));
			Thread.sleep(25);
		}
	} catch(Exception e) {}
	}
	
	private BigInteger factorial(int m)
	{
		 BigInteger f = new BigInteger("1"); 
        for (int i = 2; i <= m; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
	}
}
class FibonaaciThread extends Thread
{
	String tname;
	int n;
	
	FibonaaciThread(String name,int n)
	{
		tname=name;
		this.n=n;
	}
	
	public void run()
	{
		try{
			for(int i=1;i<=n;i++)
			{
				System.out.println(tname+":Fibonaaci(" +i +")=" + fibo(i));
				Thread.sleep(25);
			}
		}
		catch(Exception e)
		{}
	}
	private int fibo(int n)
	{
		if(n<=1)
			return n;
		else
			return fibo(n-1) +fibo(n-2);
	}
}			

public class ThreadDemo
{
	public static void main(String args[])
	{
		PrimeThread primeThread = new PrimeThread("PrimeThread", 500);
		FactorialThread factorialThread = new FactorialThread("FactorialThread", 50);
		FibonaaciThread fibonaaciThread=new FibonaaciThread("FibonaaciThread" ,30);
		primeThread.start();
		factorialThread.start();
		fibonaaciThread.start();
	}
}

	