class Sample
{
	public static void main(String args[])
	{
		int x[]={50,80,20,40,90,60,30,100,70,10};
		int i,j,temp=0;
		System.out.print("UNSorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
		for(i=1;i<10;i++)
		{
			temp=x[i];
			j=i-1;
					while(j>=0&&x[j]>temp)
					{
						x[j+1]=x[j];
						j=j-1;
					}
					x[j+1]=temp;
		}
		System.out.print("Sorted Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println("]");
	}		
}