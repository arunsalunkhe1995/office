package Constructor;

public class text7 
{
	int a;
	int b;
	
	text7()
	{
		this(20,50);
	}
	
	text7(int p, int q)
	{
		a=p;
		b=q;
	}
	text7(int x)
	{
		
	}
	public void sum()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		text7 Sum1=new text7();
			  Sum1.sum();
	}
}
