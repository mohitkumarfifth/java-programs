class Sample
{
	public static void main(String args[])
	{
		int x=0,y=1,z=10,r,i;
		System.out.println(":Fabonacci Series:");
		System.out.println("\t"+x+"\n\t"+y);
		for(i=1;i<=(z-2);i++)
		{
			r=x+y;
			System.out.println("\t"+r);
			x=y;
			y=r;
		}
		
	}
}