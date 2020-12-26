class Sample
{
	public static void main(String args[])
	{
		int x[]={5,8,2,4,9,6,3,10,7,1};
		int i,j,temp=0;
		System.out.print("UNSorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
	}		
}