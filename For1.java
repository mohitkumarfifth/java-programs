import java.util.Scanner;
class For1
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int i,j,a;
		System.out.print("enter the value for rows=");
		a=m.nextInt();
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}