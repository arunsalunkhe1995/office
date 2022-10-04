package Constructor;

public class text5 
{
	//Variable declaration
	int num1;
	int num2;
	String StudentName;
	// variable initialization
	text5()           //user defined Constructor with zero parameter
	{
		num1=20;
		num2=40;
	}
	text5(int a, int b)	   //user defined Constructor with zero parameter 
	{
		num1=a;
		num2=b;	
	}
	text5( String sname)
	{
		StudentName=sname;
	}
	public void addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	public void sub()
	{
		int sub=num1-num2;
		
		System.out.println(sub);
	}
	public void name()
	{
		System.out.println(StudentName);
	}
	
	
	

}
