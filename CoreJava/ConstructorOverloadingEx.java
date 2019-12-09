
class Sample
	{
private int empNo;
private String empName;

public Sample()
{
	this(1242);
}

public Sample(int empNo)
{
	this("Srinu"); // Calling to a this constructor must be the first statement within the constructor
	this.empNo = empNo;
	
}

public Sample(String empName)
	{
this.empName = empName;
	}

public String toString()
{
  return empNo+" : " +empName;
}
	}

public class ConstructorOverloadingEx
	{
public static void main(String args[])
{
	Sample emp1 = new Sample();
	Sample emp2 = new Sample();
	System.out.println(" emp1 : "+emp1); //emp1.toString()
	System.out.println(" emp2 : "+emp2);
}
	}