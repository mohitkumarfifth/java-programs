class Sample
{
	public static void main(String args[])
	{
		int i,j,arr[]={11,22,33,44,55,66,77,88,99,111};
		int v=99,temp=0,pos=0;
		System.out.print("Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("]");
		for(i=0;i<10;i++)
		{
			if(arr[i]==v)
			{
				pos=i;
				temp=1;	
				break;
			}
		}	
		if(temp==1)
		{
			System.out.println(v+":Element is found on the positon:="+pos);
		}	
		else
		{
			System.out.println("Element not found");
		}
	}
}