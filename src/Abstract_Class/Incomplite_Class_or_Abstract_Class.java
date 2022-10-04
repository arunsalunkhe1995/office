package Abstract_Class;

public abstract class Incomplite_Class_or_Abstract_Class 
{
	/* abstract keyword used for incomplete method
	 * in class name 'abstract' keywords are used before  or after of public keyword
	 * incomplete class means incomplete method
	 * incomplete method ===> only Method declaration present & Method definition not available
	 * formula for abstract method==> abstract public void name();
	 * we can write class name in both way "public abstract class" or "abstract public class"
	 * super class
	 */ 
	//complete method
	public void M1()
	{
		System.out.println("method M1 is complete in Abstract Class");
	}
	
	// incomplete  method // Abstract Method
	abstract public void M2();					// method declaration
	
	// incomplete  method // Abstract Method
	abstract public void M3();					// method declaration
	
	

}
