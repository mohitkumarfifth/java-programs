class Sal
{
	public static void main(String args[])
	{
		int bs=30000;
		double gs,hra,da,ta;
		if(bs<=25000)
		{
			hra=(bs/100)*10;
			da=(bs/100)*10;
			ta=(bs/100)*10;
			gs=bs+hra+da+ta;
			System.out.println("Gross Salary:=Rs."+gs);
		}
		else if(bs>25000)
		{
			hra=(bs/100)*20;
			da=(bs/100)*20;
			ta=(bs/100)*20;
			gs=bs+hra+da+ta;
			System.out.println("Gross Salary:=Rs."+gs);
		}
		else
		{
			System.out.println("Gross Salary not calculated");
		}
	}
}