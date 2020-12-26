class Sample
{
	public static void main(String args[])
	{
		int i;
		char x=65;
		char a[]=new char[5];
		for(i=0;i<5;i++)
		{
			a[i]=x;
			x++;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(i+1+":Elements of Array:="+a[i]);
		}
	}
}