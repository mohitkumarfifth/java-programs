import java.util.Scanner;
class Great
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.print("enter the value of a=");
		a=s.nextInt();
		System.out.print("enter the value of b=");
		b=s.nextInt();
		System.out.print("enter the value of c=");
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}

		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		if(b==c)
		{
			System.out.println("b and c are equal");
		}

	}
}