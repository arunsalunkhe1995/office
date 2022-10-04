package Constructor;

public class text2 
{	// default constructor 
	// text2(){}
	
	/* static regular method
	 * use in text1
	 */
	public static void adition()
	{
		int a=15;
		int b=35;
		int sum=a+b;
		
		System.out.println(sum);    // output=50
	}
	// non static regular method
	
	public void sub(int a, int b, int c) 
	{
		int sub = a-b-c;
		System.out.println(sub); 
		
	}

}
