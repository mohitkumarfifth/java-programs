class Sample
{
	public static void main(String args[])
	{
		int x[]={4,5,7,10,11,13,15,17,19,20};
		int i,j,temp;
		System.out.print("Prime Numbers are:=");
		for(i=0;i<10;i++)
		{
			temp=0;
			for(j=2;j<=x[i]/2;j++)
			{
				if(x[i]%j==0)
				{
					temp=1;
				}
			}
			if(temp==0)
			{
				System.out.print(x[i]+"  ");
			}	
		}
	}
}