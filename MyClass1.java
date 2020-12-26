import java.util.Scanner;
public class MyClass1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		String str=sc.nextLine();
		char charr[]= str.toCharArray();
		//string to character array
		int i;
		System.out.print("String is=="+str+"==Special Symbol in this String:==");
		try
		{
		for(i=0;i<=charr.length;i++)
		{
				if(charr[i]>=65&&charr[i]<=90||charr[i]>=97&&charr[i]<=122)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(""+charr[i]+" ");
				}
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("");
		}
		
	}
}