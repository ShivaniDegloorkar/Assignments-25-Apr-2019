public class AddingIntegers{

    public static void main(String[] args) {
    	if(args.length <= 1){
    		System.out.println("Cannot perform addition on single digit");
    	}
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("The sum of the arguments passed is " + sum);
    }
}    