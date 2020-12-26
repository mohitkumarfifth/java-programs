import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int i,j,a;
		System.out.print("enter the number for table=");
		a=m.nextInt();
		for(i=1;i<=a;i++)
		{
		System.out.println("table of "+i);
			for(j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
		System.out.println("\n");
		}

	}
}