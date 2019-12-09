import java.io.IOException;
import java.io.FileNotFoundException;
class Vechile
	{
protected void run() throws IOException
{
  System.out.println(" Vechile is Running");
}

public void run(String name)
{
  System.out.println(name + "  is Running");
}
	}

class Bus extends Vechile
	{
public void run() 
{
  System.out.println(" Bus is Running !!!!"); 
}
	}

public class CompileTimeAndRunTimePollymorphismEx
	{
public static void main(String args[])
{
	Vechile v = new Bus();
	try
	{
	v.run("Scooter"); // compile time pollymorphism
	v.run(); // run time pollymorphism
	}catch(IOException exp){}
}
	}