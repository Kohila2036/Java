package Poly;

public class overloading1 {

	static void contactsave(String name,int num)    // overloading with change in no.of arguments
	{
		System.out.println("Saving contact for " +name+" with 1 number" );
	}
	
	static void contactsave(String name, int num1, int num2)
	{
		System.out.println("Saving contact for " +name+" with 2 numbers" );
	}
	
	
	public static void main(String[] args) {
		
		overloading1.contactsave("Viji", 12345);
		overloading1.contactsave("Viji", 12345, 12222);
	}

}
