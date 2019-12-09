interface A
	{
public abstract void display();
	}

interface B
	{
public abstract void display();
	}

class C implements A,B
	{
public void display()
{
System.out.println(" Overrding display() method of B");
}
	}

public class MultipleInheritanceApp
	{
public static void main(String args[])
{
	B obj = new C();
	obj.display();
}
	}