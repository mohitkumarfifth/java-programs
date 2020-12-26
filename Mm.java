import java.util.Scanner;
class Mm
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j,k;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter values for first matrix :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt(); 
			}
		}
		System.out.println("Enter values for second matrix :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("Your first matrix : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Your second matrix : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("Result of Matrix Multiplication : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}