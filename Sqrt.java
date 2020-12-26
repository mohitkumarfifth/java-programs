class Sample
{
	public static void main(String args[])
	{
		int i,j;
		boolean temp=false;
		 int x=25,r=1;
		for(i=0;i<=x/2;i++)
		{
			r=i*i;
			if(r==x)
			{
				temp=true;
				break;
			}
		}
		if(temp)
		System.out.println("the square root:="+i);
	}
}