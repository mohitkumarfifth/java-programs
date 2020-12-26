import java.util.Scanner;
class Loop3
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a,i,sum=0;
		System.out.print("enter the number =");
		a=m.nextInt();
		do
		{
			i=a%10;
			sum=sum+(i*i*i);
			a=a/10;
		}
		while(a>0);
		System.out.println("sum digits="+sum);
	}
}