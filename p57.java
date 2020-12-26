class Sample
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println("\t\t\t******TABLES IN JAVA******");
		System.out.println("\t\t\t==========================");
		for(k=1;k<=5;k++)
		{
			System.out.print("Table Of:="+k+"\t");
		}
		System.out.println("");
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(j+" * "+i+" = "+i*j+"\t");
			}
		System.out.print("\n");
		}

	}
}