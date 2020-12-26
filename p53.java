class Sample
{
	public static void main(String args[])
	{
		int rev=0,n=121,a,temp;
		temp=n;
		while(n>0)
		{
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		System.out.println("Reverse of the Number is:="+rev);
		if(rev==temp)
		{
			System.out.println("This number is Palindrome.");
		}
		else
		{
			System.out.println("This number is not Palindrome");
		}
	}
}