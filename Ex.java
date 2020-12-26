import java.util.Scanner;
class Ex
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		a:
		for(i=1;i<=5;i++)
		{
			if(i==2&&i==3)
			{
				System.out.println("nice");
				continue a;
			}
		}
		
	}
}