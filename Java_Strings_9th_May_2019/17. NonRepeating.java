class NonRepeating
{
	void nonRepeat(String str)
	{
		char []arr = str.toCharArray();
		int flag = 0; 
		char temp = 0;
		for(int i = 0; i < arr.length; i++)
		{
			flag = 1;
			for(int j = 0; j < arr.length; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					flag = 0;
				}
			}

			if(flag == 1)
			{
				temp = arr[i];
				break;
			}
		}

		System.out.println("First non repeating character is: "+temp);
	}

	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		new NonRepeating().nonRepeat(str);
	}
}