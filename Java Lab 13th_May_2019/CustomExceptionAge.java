class MyException extends Exception {

   MyException(String str){
        super(str);
    }
}

public class CustomExceptionAge {
   
   public static void main(String args[]) throws MyException {
   
      
         System.out.println("Enter your name");
         java.util.Scanner sc = new java.util.Scanner(System.in);
		    int str = sc.nextInt();
      	 if(str < 15)
         	throw new MyException("Age should be greater than 15");
      
   }
}