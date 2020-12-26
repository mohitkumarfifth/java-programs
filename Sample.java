class Sample
{
	public static void main(String args[])
	{
		char z[]={'m','o','h','i','t'};
		System.out.println("vowel from name");
		for(int i=0;i<5;i++)
		{
			if(z[i]=='a'||z[i]=='e'||z[i]=='i'||z[i]=='o'||z[i]=='u')
			{
				System.out.println("Vowel="+z[i]);
			}
		}
	}
}