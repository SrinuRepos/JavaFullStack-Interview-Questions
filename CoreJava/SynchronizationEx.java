class PrintTable
	{
public synchronized void print(int n)
{
	for(int i = 1 ; i <= 10 ; i++)
		{
	System.out.println(n + " * " + i+ " = "+ (n*i));
	try{
	Thread.sleep(1000);
	   }catch(Exception e){}
		}
}
	}


class SampleThread extends Thread
	{
PrintTable table = null;
int n ;

public SampleThread(PrintTable table,int n)
{
	this.table = table;
	this.n = n;
}

public void run()
	{
	table.print(n);
	}
}


public class SynchronizationEx
	{
public static void main(String args[])
{
	PrintTable table = new PrintTable();

	SampleThread t1 = new SampleThread(table,1);
	SampleThread t2 = new SampleThread(table,2);
	SampleThread t3 = new SampleThread(table,3);
	t1.start();
	t2.start();
	t3.start();
}
	}