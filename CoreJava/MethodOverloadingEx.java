class Sample
	{
public void print()
{
System.out.println(" From sample print() ");
}

public void print(int num)
{
System.out.println(" From sample print(int num) num = "+num);
}

public void print(String name)
{
System.out.println(" From sample print(String) name = "+name);
}

	}

public class MethodOverloadingEx
	{
public static void main(String args[])
{
 Sample s = new Sample();
	s.print();
	s.print(111);
	s.print("Naresh");
}
	}