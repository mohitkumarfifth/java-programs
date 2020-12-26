import java.util.Scanner;
class Loop2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i=1,a,b;
		System.out.print("enter the number for table =");
		a=s.nextInt();
		System.out.print("enter the number till you want to run the table=");
		b=s.nextInt();
		while(i<=b)
		{
			System.out.println(a+" * "+i+"  = "+a*i);
			i++;
		}
	}
}