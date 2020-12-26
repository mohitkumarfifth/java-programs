class Tri
{
	public static void main(String args[])
	{
		int a=90,b=45,c=45,sum;
		sum=a+b+c;
		System.out.println("Sum of Angles of Triangle:="+sum);
		if(sum==180)
		{
			System.out.println("The Triangle is Valid");
		}
		else
		{
			System.out.println("The Triangle is not Valid");
		}
	}
}