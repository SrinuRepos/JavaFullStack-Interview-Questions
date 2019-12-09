class Address implements Cloneable // mutable class
	{
private String city;

public Address(String city)
{
	this.city = city;
}
public void setCity(String city)
{
	this.city = city;
}

public String getCity()
{
	return city;
}

public Address copyObject() throws Exception
{
	Address add =(Address)super.clone();
	return add;
}
	}

final class Person // immutable class
{
 private final String personName;
 private final Address address ;

	public Person(String personName,Address address)
	{
		this.personName = personName;
		this.address = address;
	}
public String getPersonName()
	{
return personName;
	}
public Address getAddress() throws Exception
	{
Address add =  address.copyObject();
return add;
	}
}

public class ImmutableEx
	{
public static void main(String args[]) throws Exception
{
	Address address = new Address("Hyd");
	
	Person p = new Person("Srinu",address);
	System.out.println(" \n\n Before Update ::: Person Data => "+p.getPersonName()+"  :: "+p.getAddress().getCity());
	Address ad = p.getAddress();
	System.out.println("\n address hascode "+address);
	System.out.println(" ad hascode "+ad);
	ad.setCity("Banglore");	
	System.out.println(" \n\n After Update ::: Person Data => "+p.getPersonName()+"  :: "+p.getAddress().getCity());

}
	}