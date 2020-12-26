import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("enter the value of a and b=");
a=s.nextInt();
b=s.nextInt();
System.out.println("before swapping");
System.out.println("value of a="+a);
System.out.println("value of b="+b);
c=a;
a=b;
b=c;
System.out.println("after swapping");
System.out.println("now value of a="+a);
System.out.println("now value of b="+b);
}

}