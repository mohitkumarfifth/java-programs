class Sample
{
	public static void main(String args[])
	{
		int x[]={11,12,13,14,15,16,17,18,19,20};
		int i;
		System.out.println(":Even Elements of Array:");
		for(i=0;i<10;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]);
			}
		}
	}
}