class Sample
{
	public static void main(String args[])
	{
		int x[]={4,5,8,10,11};
		int i,j,fact;
		System.out.println(":Factorial of Elements of Array:");
		for(i=0;i<5;i++)
		{
			fact=1;
			for(j=1;j<=x[i];j++)
			{
				fact=fact*j;
			}
			System.out.println(i+1+":Element:Factorial of element: "+x[i]+":="+fact);
		}
	}
}