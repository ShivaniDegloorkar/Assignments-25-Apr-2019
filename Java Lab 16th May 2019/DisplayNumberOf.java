import java.io.*;
class DisplayNumberOf
{
	public static void main(String[] args) {
		File file = new File("anotherFile.txt");
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String str; int lines = 0; String []arr; int numberofwords = 0;;
    		while((str = reader.readLine()) != null)
    		{
    			arr = str.split("\\s");
    			numberofwords = numberofwords + arr.length;
    			++lines;
    		}

    		System.out.println("Number of lines : "+lines);
    		System.out.println("Number of words : "+numberofwords);

			reader.close();
			
			int numberofChars = 0; int value = 0;
			FileInputStream fileIn=new FileInputStream(file);
            while((value = fileIn.read())!=-1)
            {
                ++numberofChars;
            }   
              
            System.out.println("Number of characters are: "+numberofChars);   
              
            fileIn.close();    
		}catch(Exception e)
		{
			System.out.println("Exception caught: "+e);
		}
	}
}