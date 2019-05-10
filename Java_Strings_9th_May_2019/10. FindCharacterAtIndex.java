import java.util.Scanner;

class FindCharacterAtIndex{
	public static void main(String[] args)
	{
		String str="Shivani";
		System.out.println("The string is: "+str);
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the index: ");
		int index=in.nextInt();
		if(index < str.length()){
			System.out.println("The character at the index "+index+" is: "+str.charAt(index));
		}
		else
			System.out.println("Enter appropriate index");
	}
}