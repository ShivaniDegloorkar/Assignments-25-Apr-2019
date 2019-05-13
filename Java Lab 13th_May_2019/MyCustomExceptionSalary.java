import com.cg.eis.exception.MyExceptionDemo;

public class MyCustomExceptionSalary {
   
   public static void main(String args[])  {
   
      
         System.out.println("Enter your salary");
         java.util.Scanner sc = new java.util.Scanner(System.in);
		 int sal = sc.nextInt();
	
		 try
		 {
		 	new MyCustomExceptionSalary().checkSal(sal);

		 }catch(MyExceptionDemo e)
		 {
		 	System.out.println("Exception caught: " + e);
		 }
      	 
   }

   public void checkSal(int sal) throws MyExceptionDemo
   {
   		System.out.println("Checking salary");
   		if(sal < 3000)
        	throw new MyExceptionDemo("Salary below 3000");
        else
        	System.out.println("Salary above 3000");
   }
}
