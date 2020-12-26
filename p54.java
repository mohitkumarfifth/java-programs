class Sample
{
	public static void main(String args[])
	{
		int n=20,i,temp=1;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("This Number is not Prime Number.");
				temp=0;
			}
			break;
		}
		if(temp==1)
		{
			System.out.println("This Number is Prime Number.");
		}
	}
}