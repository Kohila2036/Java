package Encap;

public class Encapsulatedclass1 {

	public static void main(String[] args) {
		
	// accessing private data members of bank class
		
		HoldingBankvariables Bank1=new HoldingBankvariables(); // created obj for bank class
	
	// setting values for the private data members using public setter method	
		
		Bank1.setholdername("Kohila");
		Bank1.setacccountnumber(12345);
		Bank1.setacccountbalance(1000);
		
	// 	getting values for the private data members using public getter method
		
		System.out.println("Account holder name: " + Bank1.getholdername());
		System.out.println("Account number: " +Bank1.getacccountnumber());
		System.out.println("Account balance: " +Bank1.getacccountbalance());

	}

}
