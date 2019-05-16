import java.util.Scanner;
import java.io.*;

class DisplayFileInfo
{
	public static void main(String[] args) {
		System.out.println("Enter file name you want to search");
		Scanner sc =  new Scanner(System.in);
		String filename = sc.nextLine();
		File file = new File(filename);     
		if(file.exists())
		{
			System.out.println("Can Read : "+file.canRead());
			System.out.println("Can Write : "+file.canWrite());
			System.out.println("Length of file : "+file.length());
			String type = file.getName();
			int index = type.indexOf(".");
			type = type.substring(index+1);
			System.out.println("Type of file : "+type);
		}
		else
		{
			System.out.println("File not found");
		}
	}
}