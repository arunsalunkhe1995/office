package Casting;

public class son extends father
{
	// sub class
	public void mobile()
	{
		System.out.println("one+ phone");
	}
	
	public void car()						//overrides Casting.father.car			
	{
		System.out.println("mercudies car");
	}
	
	public void home()						//overrides Casting.father.home
	{
		System.out.println("3 BHK");
	}
	
	public void money()						//overrides Casting.father.money
	{
		System.out.println("5 lakhs");
	}

}
