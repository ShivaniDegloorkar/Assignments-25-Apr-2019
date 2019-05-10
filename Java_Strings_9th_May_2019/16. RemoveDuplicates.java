class RemoveDuplicates
{
	void remove(String str)
	{
		String []temp = str.split(" ");
		java.util.Arrays.sort(temp);
		String []duplicate = new String[temp.length];
		int index = -1; 
		duplicate[++index] = temp[0];
		for(int j = 1; j < temp.length; j++)
		{
			if(! temp[j].equals(duplicate[index]))
				duplicate[++index] = temp[j];			
		}

		System.out.println("After Removing duplicate strings");
		for (int i = 0;i <= index ; i++) 
		{
			System.out.println(""+duplicate[i]);	
		}
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		new RemoveDuplicates().remove(str);
	}
}          