class Grade
{
	public static void main(String args[])
	{
		int e=80,h=75,m=60,sci=70,s=55;
		double p,t;
		t=e+h+m+sci+s;
		p=(t/500)*100;
		System.out.println("Percentage:="+p);
		if(p>=80)
		{
			System.out.println("Grade A");	
		}
		else if(p>=70&&p<=79)
		{
			System.out.println("Grade B");
		}
		else if(p>=60&&p<=69)
		{
			System.out.println("Grade c");	
		}
		else if(p>=50&&p<=59)
		{
			System.out.println("Grade D");
		}
		else if(p>=40&&p<=49)
		{
			System.out.println("Grade E");	
		}
		else if(p<=40)
		{
			System.out.println("Grade F");
		}
		else
		{
			System.out.println("Grading System");
		}
	}
}