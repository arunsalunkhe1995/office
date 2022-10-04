package Constructor;

public class text1
{
	/*
	 * default  constructor
	 * use1= copy all member of class into on object- after creation of object
	 * default constructor ---> text1(){}
	 * */
	public static void main(String[] args)
	{
		// call from same class
		m1();
		
		text1 T1=new text1();
		      T1.m2();
		// call from text 2 class
		// static method call from diff. class 
		 text2.adition();
		 
		 // non static call from diff class
		 // create object of text2 class
		 text2 T2= new text2();
		 T2.sub(100, 10, 20);      // output=70 
		 
	}
	
	
	public static void m1() 
	{
		System.out.println("Hii");
	
	}
	
	public void m2()
	{
		System.out.println("hello");
	}
	
}
