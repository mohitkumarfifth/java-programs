class Sample
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40,50,60,70,80,90,100};
		int i,v=50,temp=0;
		for(i=0;i<10;i++)
		{
			if(x[i]==v)
			{
				temp=i;
			}
		}
		for(i=0;i<10;i++)
		{
			if(i>temp)
			{
				x[i-1]=x[i];
			}
		}
		System.out.print("New Array:=[ ");
		for(i=0;i<9;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
	}		
}