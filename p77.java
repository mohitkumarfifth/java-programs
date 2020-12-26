class Sample
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40,50,60,70,80,90,100};
		int y[]=new int[11];
		int i,p=5,v=55;
		for(i=0;i<11;i++)
		{
			if(i==p)
			{
				y[i]=v;
			}
			else if(i>p)
			{
				y[i]=x[i-1];
			}
			else
			{	
				y[i]=x[i];
			}	
		}
		System.out.print("New Array:=[ ");
		for(i=0;i<11;i++)
		{
			System.out.print(y[i]+"  ");
		}
		System.out.println("]");
	}		
}