class Sample
{
	public static void main(String args[])
	{
		int i;
		double d=12.05;
		double a[]=new double[5];
		for(i=0;i<5;i++)
		{
			a[i]=d;
			d++;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(i+1+":Elements of Array:="+a[i]);
		}
	}
}