package Control_Statement;

public class insted_if1 
{
	public static void main(String[] args)
	{
	String username="arunsalunkhe";
	String password="arun123";
	if ("arunsalunkhe"==username)
	{
		System.out.println("Correct username");
		if("arun123"==password)
		{
			System.out.println("Correct password-->> login succesfully");
		}
		else 
		{
			System.out.println("Wrong Password");
		}
	}
	else
	{
		System.out.println("Wrong username");
	}
	}
}
