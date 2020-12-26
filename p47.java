class Bill
{
	public static void main(String args[])
	{
		int u=700,bill,x;
		if(u<=250)
		{
			bill=3*u;
			System.out.println("Electricity Bill:=Rs."+bill);
		}
		else if(u>250&&u<=500)
		{
			x=u-250;	
			bill=(3*250)+(x*5);
			System.out.println("Electricity Bill:=Rs."+bill);
		}
		else if(u>500)
		{
			x=u-500;
			bill=(3*250)+(5*250)+(8*x);
			System.out.println("Electricity Bill:=Rs"+bill);
		}
		else
		{
			System.out.print("Electricity Bill is not Generated");
		}
	}
}