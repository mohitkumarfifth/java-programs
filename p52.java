class Sample
{
	public static void main(String args[])
	{
		int rev=0,n=1234,a;
		while(n>0)
		{
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		System.out.println("Reverse of the Number is:="+rev);
	}
}