class Sample
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40,50,60,70,80,90,100};
		int i,p=5;
		for(i=0;i<10;i++)
		{
			if(i>p)
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