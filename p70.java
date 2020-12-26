class Sample
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40,50};
		int i;
		float av=0;
		for(i=0;i<5;i++)
		{
			av=(float)(av+x[i]);
		}
		System.out.println("Sum of Elements:="+av);
		av=(float)(av/5);
		System.out.println("Average of Array Elements:="+av);
	}
}