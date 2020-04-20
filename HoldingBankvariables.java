package Encap;

public class HoldingBankvariables {
	
	private String holdername;
	private int accountnumber;
	private int accountbalance;  // private data members which wil be hidden from outside class
	
	//creating public setter and getter methods for setting/getting the values for the private data members
	
	public void setholdername(String name)
	{
		holdername=name;
	}
	public String getholdername()
	{
		return holdername;
	}
	public void setacccountnumber(int number)
	{
		accountnumber=number;
	}
	public int getacccountnumber()
	{
		return accountnumber;
	}
	public void setacccountbalance(int balance)
	{
		accountbalance=balance;
	}
	public int getacccountbalance()
	{
		return accountbalance;
	}
}
