package Constructor;

public class text4 
{
	/* use1= it copies all information of class into an object- after creation of object
	   use2= to initialize data of member
	*/
	// step1- Variable declaration 
	int c;
	int d;
	
	// step2-variable initialization 
	
	text4()
	{
		c=50;
		d=50;
	}
	
	//step3= uses 
	
	public void div()
	{
		System.out.println(c/d);      // output- 50/50=1
		
	}
	public static void main(String[] args) 
	{ 	// create object of same call 
		text4 T4= new text4();
			  T4.div();
			  
	    // create object of different class
			  text3 T3= new text3();
			  	    T3.multt();
			  	    T3.add();
	}

}
