package Poly;

public class overlaoding2 {
	
	// change in data type of arguments 
	
	   // Method with 2 parameter 
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    // Method with the same name and parameter but diff data type
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
    public static void main(String[] args) 
    { 
        System.out.println(overlaoding2.Multiply(2, 4)); 
  
        System.out.println(overlaoding2.Multiply(2.0, 4.0)); 
    } 
} 


