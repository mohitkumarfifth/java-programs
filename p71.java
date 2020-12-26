class Sample
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40};
		int i;
		float av=0;
		for(i=0;i<4;i++)
		{
			av=(float)(av+x[i]);
		}
		System.out.println("Sum of Elements:="+av);
	}
}