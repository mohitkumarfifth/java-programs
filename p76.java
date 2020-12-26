class Sample
{
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5};
		int y[]={6,7,8,9,10};
		int z[]=new int[10];
		int i;
		System.out.print("First Array:=[\t");
		for(i=0;i<5;i++)
		{
			System.out.print(x[i]+"\t");
			z[i]=x[i];
		}
		System.out.println("]");
		System.out.print("Second Array:=[\t");
		for(i=0;i<5;i++)
		{
			System.out.print(y[i]+"\t");
			z[i+5]=y[i];
		}
		System.out.println("]");
		System.out.print("Merged Array:=[\t");
		for(i=0;i<10;i++)
		{
			System.out.print(z[i]+"\t");
		}
		System.out.println("]");
	}
}