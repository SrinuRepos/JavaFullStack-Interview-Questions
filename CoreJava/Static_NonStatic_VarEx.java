class Sample
	{
private int count1 = 10;
private static int count2 = 10;

public Sample()
{
count1++;
count2++;
}

public void display()
{
System.out.println(" count1 => "+count1);
System.out.println(" count2=> "+count2);
}
	}

public class Static_NonStatic_VarEx
	{
public static void main(String args[])
{
	Sample s1 = new Sample();
System.out.println(" \nFrom s1");
	s1.display();


	Sample s2 = new Sample();
System.out.println(" \nFrom s2");
	s2.display();


	Sample s3 = new Sample();
System.out.println(" \nFrom s3");
	s3.display();
}
	}