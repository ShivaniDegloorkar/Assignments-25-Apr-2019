import java.io.*;

class ReadDisplayFileWithLineNumber
{
	public static void main(String[] args) 
	{
		File file = new File("anotherFile.txt");
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String str; int i = 0;
    		while((str = reader.readLine()) != null)
    		{
    			System.out.print(++i+" ");
    			System.out.print(str+"\n");
    		}

    		reader.close();
		}catch(Exception e)
		{
			System.out.println("Exception caught: "+e);
		}
	}
}