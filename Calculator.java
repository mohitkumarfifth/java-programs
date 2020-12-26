import java.util.Scanner;
class Calculator
{
	void division(int a, int b)
	{
		System.out.println("Result="+(a/b));
	}
	void addition(int a, int b)
	{
		System.out.println("Result="+(a+b));	
	}
	void substraction(int a, int b)
	{
		System.out.println("Result="+(a-b));
	}
	void multiplication(int a, int b)
	{
		System.out.println("Result="+(a*b));
	}
	public static void main(String args[])
	{
		int a,b,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two numbers=");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Now enter your choice=");
		n=s.nextInt();
		switch(n)
		{
			case 1:division(a,b);
			break;
			case 2:addition(a,b);
			break;
			case 3:substraction(a,b);
			break;
			case 4:multiplication(a,b);
			break;
			default: System.out.println("choose write option");
		}
	}
}