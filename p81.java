class Sample
{
	public static void main(String args[])
	{
		int x[]={19,20,17,15,16,12,11,14,13,18};
		int i,j,k,temp;
		System.out.print("UNSorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
		for(i=0;i<10-1;i++)
		{
			k=i;
			for(j=i+1;j<10;j++)
			{
				if(x[j]<x[k])
				{
					k=j;
				}	
			}
			temp=x[k];
			x[k]=x[i];
			x[i]=temp;
		}
		System.out.print("Sorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
	}
}