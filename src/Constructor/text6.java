package Constructor;

public class text6 
{
	// uses 
	// creating object of different 
	public static void main(String[] args)
	{
		// Call From Class text5
	text5 T5= new text5();			// zero parameter
		  T5.addition();		   //60
		  T5.sub();					// -20
    text5 T6=new text5(40,50);		// two parameter
		  T6.addition();			// 90
		  T6.sub();					// -10
    text5 T7=new text5(20,30);		// // two parameter
    	  T7.addition();			// 50
    	  T7.sub();					// -10
    text5 T8=new text5("Arun salunkhe"); // // Single parameter
    	  T8.name();				// Arun Salunkhe
	}
}
