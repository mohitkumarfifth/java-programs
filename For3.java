import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int i,j,a;
		System.out.print("enter the number of rows=");
		a=m.nextInt();
		for(i=1;i<=a;i++)
		{
			while(i<=a)
			{
				System.out.println(a+" * "+i+" = "+a*i);
			}
		System.out.print("table of "+a);
		}
	}
}