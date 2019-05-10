class InitialsFromFullName{ 
      
   public static void main(String args[]) 
    { 
        String name = "Shivani Degloorkar"; 
        String str[] = name.split(" "); 
        for(String word : str) { 
            System.out.print(" "+Character.toUpperCase(word.charAt(0))); 
        } 
    } 
  
}