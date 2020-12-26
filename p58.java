class Sample
{
	public static void main(String args[])
	{
		int i,j,k;
		System.out.println("\t\t\t******TABLES IN JAVA******");
		System.out.println("\t\t\t==========================");
		for(k=3;k<=10;k++)
		{
			System.out.print("Table Of:="+k+"\t");
			k=k+2;
		}
		System.out.println("");
		for(i=1;i<=10;i++)
		{
			for(j=3;j<=10;j++)
			{
				System.out.print(j+" * "+i+" = "+i*j+"\t");
				j=j+2;
			}
		System.out.println("");
		}

	}
}