import java.util.Scanner;
public class MyClass1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int j,n;
		System.out.print("Enter number of strings you want==");
		String str[n]={};
		for(j=0;j<=n;j++)
		{
			System.out.print("Enter the "+j+1+" String=");
			String str[j]=sc.nextLine();
		}
		for(j=0;j<=n;j++)
		{
			System.out.print(String str[j]+"=="+str.length(j));
		}
		/*for(j=0;j<=n;j++)
		{
			System.out.print(String str[j]+"=="str.length(j));
		}*/
	}
}