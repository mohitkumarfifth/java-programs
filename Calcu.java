package Calcu;
import java.util.Scanner;
import add.*;
import sub.*;
import mul.*;
import div.*;
class Calcu
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Addition a1=new Addition();
		Substraction s1=new Subraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		int a,b,n;
		System.out.println("enter the two numbers=");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Now enter your choice=");
		n=s.nextInt();
		switch(n)
		{
			case 1:d.division(a,b);
			break;
			case 2:a1.addition(a,b);
			break;
			case 3:s1.substraction(a,b);
			break;
			case 4:m.multiplication(a,b);
			break;
			default: System.out.println("choose write option");
		}
	}
}