
class Sample
	{
private int empNo;
private String empName;

public Sample(int empNo , String empName)
{
	this.empNo = empNo;
	this.empName = empName;
}


public String toString()
{
  return empNo+" : " +empName;
}
	}

public class ParatmeterizedConstructorEx
	{
public static void main(String args[])
{
	Sample emp1 = new Sample(111,"Srinu");
	Sample emp2 = new Sample(222,"Akash");
	System.out.println(" emp1 : "+emp1); //jvm calls emp1.toString()
	System.out.println(" emp2 : "+emp2);
}
	}