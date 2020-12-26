import java.util.Scanner;
class Demo
{
	static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	public static void main(String args[])
	{
		int a;
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER=");
		a=obj.nextInt();
		System.out.println("FACTORIAL="+fact(a));
	}
}