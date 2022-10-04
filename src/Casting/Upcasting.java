package Casting;

public class Upcasting 
{
	public static void main(String[] args) 
	{
		// create object of sub class by providing reference of super class is called upcasting
		// Original son class method can not call because of upcasting 
		// only those methods are  called that extended from super class
		// upcasting  means return all method from sub class to super class 
		
			father S1=new son();        
				   S1.car();
				   S1.home();
				   S1.money();
	}

	
}
