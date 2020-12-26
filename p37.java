class Leap
{
	public static void main(String args[])
	{
		int a=2020;
		if(a%100!=0&&a%4==0||a%100==0&&a%4==0)
		{
			System.out.println("This is Leap Year");
		}
		else
		{
			System.out.println("This is not Leap Year");
		}
	}
}