package Inheritance;

public class hirachicle_inheritance 
{
	// hirachicle inheritance means number of sub class acquires properties of single superclass
	//father1 is super class & son1, son2, son3 are sub classes
	
	// create object of all three classes in main method
	
	public static void main(String[] args) 
	{
		son1 S1= new son1();
			 S1.Mobile();
			 S1.property();
			 
		son2 S2=new son2();
			 S2.Bike();
			 S2.property();
		
		son3 S3=new son3();
			 S3.laptop();
			 S3.property();
	}
}
