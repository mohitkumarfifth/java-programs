import java.util.Scanner;
class Mt
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("enter the values of your matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Your Matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
		System.out.println("Your Transposed Matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println("");
		}
	}
}