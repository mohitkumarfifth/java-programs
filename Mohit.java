class Mohit
{
	public static void main(String args[])
	{
		try
		{
			int a=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divided by zero");
		}
		System.out.println("My name is Mohit");
	}
}