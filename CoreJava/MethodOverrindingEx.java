import java.io.IOException;
import java.io.FileNotFoundException;
class Vechile
	{
protected void run() throws IOException
{
  System.out.println(" Vechile is Running");
}
	}

class Bus extends Vechile
	{
public void run() throws FileNotFoundException
{
  System.out.println(" Bus is Running !!!!"); 
}
	}

public class MethodOverrindingEx
	{
public static void main(String args[])
{
	Vechile v = new Bus();
	try
	{
	v.run();
	}catch(IOException exp){}
}
	}