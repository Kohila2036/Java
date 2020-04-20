package Poly;

class Father1   // Base class
{
	public void home(){
		System.out.println("Father's home"); 
	}
	public void car(){
		System.out.println("Father's Car");
	}
}

class Son1 extends Father1   // child class
{

	public void car()   // overriding only car method
	{
		System.out.println("Son's Car");
	}
	
	
}
public class OverridingFatherSon {

	public static void main(String[] args) {
	
		Son1 s1=new Son1();
		s1.car();
		s1.home();
	}

}
