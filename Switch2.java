import java.util.Scanner;
class Switch2
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a;
		System.out.println("choose between 1 to 7");
		a=m.nextInt();
		switch(a)
		{
			case 1:System.out.println("Monday");
				break;
			case 2:System.out.println("Tuesday");
				break;
			case 3:System.out.println("Wednesday");
				break;
			case 4:System.out.println("Thrusday");
				break;
			case 5:System.out.println("Friday");
				break;
			case 6:System.out.println("Saturday");
				break;
			case 7:System.out.println("Sunday");
				break;
			default:System.out.println("Please choose correct option");
		}
	}
}