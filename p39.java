class Case
{
	public static void main(String args[])
	{
		char ch='f';
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Character is in Upper Case");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("Character is in Lower Case");
		}
		else if(ch>=0&&ch<=9)
		{
			System.out.println("Character is a Digit");
		}
		else
		{
			System.out.println("Character is a special Character");
		}
	}
}