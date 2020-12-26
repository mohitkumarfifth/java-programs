class Sample
{
	public static void main(String args[])
	{
		int i,j,arr[]={101,202,303,404,505,606,707,808,909,1001};
		int v=707,f,l,m;
		System.out.print("Array:=[ ");
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("]");
		f=0;
		l=10-1;
		m=(f+l)/2;
		while(f<=l)
		{
			if(arr[m]<v)
			{
				f=m+1;
			}
			else if(arr[m]==v)
			{
				System.out.println(v+":Element found at the position:="+m);
				break;
			}
			else
			{
				l=m-1;
			}
			m=(f+l)/2;
		}
		if(f>l)
		{
			System.out.println("Element not found.");
		}
	}
}