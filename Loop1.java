import java.util.Scanner;
class Loop1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,a,num,sum=0;
		System.out.print("enter the number you want to check for armstrong=");
		a=s.nextInt();
		num=a;
		while(a>0)
		{
			i=a%10;
			sum=sum+(i*i*i);
			a=a/10;
		}
		if(num==sum)
		{
			System.out.println("this is a Armstrong number.");
		}
		else
		{
			System.out.println("this is not a Armstrong number.");
		}
	}
}