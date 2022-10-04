package Control_Statement;

public class else_if6 
{
	public static void main(String[] args) 
	{
		int marks=78;
		
		if(marks>=75)
		{
			System.out.println("Distingtion");
		}
		else if(marks>=60)
		{
			System.out.println("1st class");
		}
		else if(marks>=50)
		{
			System.out.println("Higher 2nd Class");
		}
		else if(marks>=45)
		{
			System.out.println("2nd Class");
		}
		else if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
