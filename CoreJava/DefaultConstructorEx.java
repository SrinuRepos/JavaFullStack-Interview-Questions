
class Sample
	{
private int empNo;
private String empName;

public Sample()
{
	empNo = 100;
	empName = "Srinu";
}


public String toString()
{
  return empNo+" : " +empName;
}
	}

public class DefaultConstructorEx
	{
public static void main(String args[])
{
	Sample emp1 = new Sample();
	Sample emp2 = new Sample();
	System.out.println(" emp1 : "+emp1); //emp1.toString()
	System.out.println(" emp2 : "+emp2);
}
	}