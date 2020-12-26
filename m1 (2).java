import java.util.Scanner;
class Sample 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.println("enter the values of x and y=");
		x=s.nextInt();
		y=s.nextInt();
		z=x+y;
		System.out.println("Result="+z);
	}
}