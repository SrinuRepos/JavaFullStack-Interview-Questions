class InvalidDataException extends Exception
		{
			public InvalidDataException()
			{
			}
			public InvalidDataException(String message)
			{
				super(message);
			}
		}

class Calculate
	{
public int div(int a,int b) throws InvalidDataException 
{
	if(b == 0)
		{
	throw new InvalidDataException(" B value should not be zero");
		}
return a/b;
}
	}

public class ExceptionMsgEx
	{
public static void main(String args[])
{
	try
	{
	 Calculate c = new Calculate();
	System.out.println(" Div is ::"+c.div(10,0));
	}
	catch(InvalidDataException exp)
		{
System.out.println(exp.getMessage());	
		}catch(Exception exp)
		{
System.out.println(exp.getMessage());	
		} // Catch block should be written from most specific to most general
}
	}