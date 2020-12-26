class Loop5
{
	public static void main(String ar[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("\t");
			}
			for(j=i;j<=5;j++)
			{
				System.out.print(i+j+"\t");
			}
			System.out.println("");
		}
	}
}