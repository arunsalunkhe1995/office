package Inheritance;

public class Multi_Level_Inheritance
{
	/* whatsupV1 extends In whatsupV2 & whatsupV2 extends in whatupV3
	 * that means all to class information save in whatsupV3
	 * So we can create object of whatsupV3 Class
	 */
	
	public static void main(String[] args) 
	{
		whatsupV3 W1= new whatsupV3();
				  W1.TextMsg();
				  W1.AudioCall();
				  W1.VideoCall();
	}

}
