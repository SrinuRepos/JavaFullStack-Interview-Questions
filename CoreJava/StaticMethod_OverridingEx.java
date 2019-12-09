class Parent
	{
public static void display()
{
System.out.println(" From Parent ::  static  display() ");
}
	}

class Child extends Parent
	{
public static void display()
{
System.out.println(" From Child ::  static  display() ");
}
	}


public class StaticMethod_OverridingEx
	{
public static void main(String args[])
{
	Parent p = new Child();
	p.display();
}
	}