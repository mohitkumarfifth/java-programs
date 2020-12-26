class Sample
{
	public static void main(String args[])
	{
		int i,a=6,b=10,hcf=0,lcm=0;
		for(i=2;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("HCF:="+hcf);
		lcm=(a*b)/hcf;
		System.out.println("LCM:="+lcm);
	}
}