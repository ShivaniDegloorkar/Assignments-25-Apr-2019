import java.io.*;
class SearchAndReplace
{
	public static void main(String[] args) {
		
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		System.out.println("Enter word you want to replace");
			String word = sc.nextLine();
			System.out.println("Enter word you want to replace with");
			String replacewith = sc.nextLine();

		

		try
		{
			File file = new File("anotherF.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String str; 
			String filecontent = ""; 
    		while((str = reader.readLine()) != null)
    		{
    			str = str.replace(word,replacewith);
    			filecontent = filecontent + str + "\n";
    		}
    		reader.close();
    		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    		bw.write(filecontent);
    		bw.flush();
			bw.close();
			
			
			
		}catch(Exception e)
		{
			System.out.println("Exception caught: "+e);
		}
	}
}