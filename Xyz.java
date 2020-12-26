import java.util.Scanner;
abstract class Abc
{
	abstract void show();
	abstract void display();
	void sum()
	{
		Scanner m=new Scanner(System.in);
		int a,b;
		System.out.print("enter any 2 numbers=");
		a=m.nextInt();
		b=m.nextInt();
		System.out.println(a+b);
	}
}
class Xyz extends Abc
{
	void show()
	{
		System.out.println("my name is show");
	}
	void display()
	{
		System.out.println("my name is display");
	}
	public static void main(String args[])
	{
		Abc a=new Xyz();
		a.sum();
		a.show();
		a.display();
	}
}