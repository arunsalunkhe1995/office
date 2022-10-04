package Constructor;

public class text3
{ 	/* use1= it copies all information of class into an object- after creation of object
	   use2= to initialize data of member
	*/
	
	/*step1 variable declaration */
		 
	int a;				// non static global variable 
	int b;				// non static global variable
	// step2= variable initialization
	
	text3 ()           // user defined constructor 
	{
		a=20;
		b=30;
	}
	
	//Step3= uses
	public void add()     			// non static regular method
	{
		System.out.println(a+b);
	}
	
	public void multt() 
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		text3 T3= new text3();
			  T3.add();
			  T3.multt();
				
		
	}
}
