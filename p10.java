class Boolean
{
	public static void main(String args[])
	{
		boolean b;
		b=false;
		System.out.println("Value of b:="+b);
		b=true;
		System.out.println("Value of b:="+b);
		if(b)
		{
			System.out.println("This is Executed");
		}
		b=false;
		if(b)
		{
			System.out.println("This is not Executed");
		}
		if(b==false)
		{
			System.out.println("Checking the condition");
		}
		System.out.println("(10>9)="+(10>9));
	}
}