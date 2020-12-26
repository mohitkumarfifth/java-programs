import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a,b;
		char x;
		System.out.print("Enter the first value=");
		a=m.nextInt();
		System.out.print("Enter the second value=");
		b=m.nextInt();
		System.out.println("Your options are\n1:+\n2:-\n3:*\n4:/");
		System.out.print("What operation do you want to perform in these two values=");
		x=m.next().charAt(0);
		switch(x)
		{
			case'+':System.out.println("Addition = "+(a+b));
				break;
			case'-':System.out.println("Subraction = "+(a-b));
				break;
			case'*':System.out.println("Multiplication = "+(a*b));
				break;
			case'/':System.out.println("Division = "+(a/b));
				break;
			default:System.out.println("Please choose correct option");
		}
	}
}