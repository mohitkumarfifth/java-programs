class Sample
{
	public static void main(String args[])
	{
		int i;
		int a[]=new int[5];
		for(i=0;i<5;i++)
		{
			a[i]=i;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(i+1+":Elements of Array:="+a[i]);
		}
	}
}