class MyException extends Exception {

   MyException(String str){
        super(str);
    }
}

public class CustomExceptionName {
   
   public static void main(String args[])  {
   
      
         System.out.println("Enter your name");
         java.util.Scanner sc = new java.util.Scanner(System.in);
		 String fn = sc.nextLine();
		 String ln = sc.nextLine();

		 try
		 {
		 	new CustomExceptionName().checkName(fn,ln);

		 }catch(MyException e)
		 {
		 	System.out.println("Exception caught: "+e);
		 }
      	 
   }

   public void checkName(String fn, String ln) throws MyException
   {
   		System.out.println("Checking name");
   		if(fn.equals("") || ln.equals(""))
        	throw new MyException("First name or last name cannot be empty");
        else
        	System.out.println("Name is valid");
   }
}