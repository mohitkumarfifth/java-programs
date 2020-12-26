import java.util.Scanner;
class Mm2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j,k,w,x,y,z;
		System.out.print("Enter number of rows for first matrix A :");
		w=s.nextInt();
		System.out.print("Enter number of coloumns for first matrix A :");
		x=s.nextInt();
		System.out.print("Enter number of rows for second matrix B :");
		y=s.nextInt();
		System.out.print("Enter number of columns for second matrix B :");
		z=s.nextInt();
		int a[][]=new int[w][x];
		int b[][]=new int[y][z];
		int c[][]=new int[z][w];
		if(x==y)
		{
			System.out.println("Mltiplication is possible");
			System.out.println("Enter values for first matrix A :");
			for(i=0;i<w;i++)
			{
				for(j=0;j<x;j++)
				{
					System.out.print("a["+i+"]["+j+"]=");
					a[i][j]=s.nextInt(); 
				}
			}
			System.out.println("Enter values for second matrix B :");
			for(i=0;i<y;i++)
			{
				for(j=0;j<z;j++)
				{
					System.out.print("b["+i+"]["+j+"]=");
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("Your first matrix : ");
			for(i=0;i<w;i++)
			{
				for(j=0;j<x;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println("");
			}
			System.out.println("Your second matrix : ");
			for(i=0;i<y;i++)
			{
				for(j=0;j<z;j++)
				{
					System.out.print(b[i][j]+"\t");
				}
				System.out.println("");
			}
			for(i=0;i<z;i++)
			{
				for(j=0;j<w;j++)
				{
					for(k=0;k<y;k++)
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
			System.out.println("Result of Matrix Multiplication : ");
			for(i=0;i<z;i++)
			{
				for(j=0;j<w;j++)
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Multiplication is possible");
		}	
	}
}