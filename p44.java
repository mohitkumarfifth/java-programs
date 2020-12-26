class Tri
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		if(a==b&&b==c)
		{
			System.out.println("Equilateral Triangle");
		}
		else if(a==b||a==c||b==c)
		{
			System.out.println("Isoceles Triangle");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}
	}
}