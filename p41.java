class Great
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		if(a!=b&&b!=c&&c!=a)
		{
			if(a>b&&a>c)
			{
				System.out.println("A is greatest number");
			}
			else if(b>c&&b>a)
			{
				System.out.println("B is greatest number");
			}
			else
			{
				System.out.println("C is greatest number");
			}
		}
		else if(a==b&&b!=c)
		{
			if(b>c)
			{
				System.out.println("A and B are Greater and equal numbers");
				System.out.println("C is smaller than A and B");
			}
			else
			{
				System.out.println("C is greatest number");
				System.out.println("A and B are smaller and equal numbers");
			}
		}
		else if(b==c&&c!=a)
		{
			if(c>a)
			{
				System.out.println("B and C are greater and equal numbers");
				System.out.println("A is smaller than B and C");
			}
			else
			{
				System.out.println("A is greatest number");
				System.out.println("B and C are smaller and equal numbers");
			}
		}
		else if(c==a&&a!=b)
		{
			if(a>b)
			{
				System.out.println("A and C are greater and equal numbers");
				System.out.println("B is smaller than A and C");
			}
			else
			{
				System.out.println("B is greatest number");
				System.out.println("A and C are smaller and equal numbers");
			}
		}
		else
		{
			System.out.println("All three numbers are equal");
		}	
	}
}