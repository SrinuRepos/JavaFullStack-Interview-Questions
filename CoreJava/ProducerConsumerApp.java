import java.util.List;
import java.util.ArrayList;

class Product
	{
private List<String> productList = new ArrayList<String>();
private volatile int i = 1;

public synchronized void producer() 
{
	while( i <= 10)
	{
	if(productList.size() == 0)
		{
		System.out.println(Thread.currentThread().getName()+" : product "+i);
		productList.add(" product "+i);
		i++; 
		try
		{
		Thread.sleep(1000);
		notify();
		}catch(Exception exp){}
	
		}else
		    {
			try{
			wait();
		            }catch(Exception exp){}
		    }
	}
}

public synchronized void consumer()
{
		while( i <= 10)
	{
		if(productList.size() == 0)
		{
			try{
			wait();
		            }catch(Exception exp){}
		}else{
			System.out.println(Thread.currentThread().getName()+" : "+productList.get(0));
			productList.remove(0);	
			try{
			Thread.sleep(1000);
			notify();
			 }catch(Exception exp){}
		     }
	}
}
	}

class ProducerThread extends Thread
	{
private Product p ;

public ProducerThread(Product p)
{
 this.p = p;
}

public void run()
{
	p.producer();
}
	}


class ConsumerThread extends Thread
	{
private Product p ;

public ConsumerThread(Product p)
{
 this.p = p;
}

public void run()
{
	p.consumer();
}
	}

public class ProducerConsumerApp
	{
public static void main(String args[])
{
	Product p = new Product();
	ProducerThread t1 = new ProducerThread(p);
	ConsumerThread t2 = new ConsumerThread(p);
	t1.setName("Produced");
	t2.setName("Consumed");
		t1.start();
		t2.start();
	
				
}
	}