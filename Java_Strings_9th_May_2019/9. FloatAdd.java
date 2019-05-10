import java.math.RoundingMode;
import java.text.DecimalFormat;

class FloatAdd
{
	public static void main(String[] args) 
	{
		if(args.length <= 1){
    		System.out.println("Cannot perform addition on single digit");
    	}
        
        float sum = 0.0f;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Float.parseFloat(args[i]);
        }
        System.out.println(sum);
        System.out.printf("%.2f", sum);
    }


		/*DecimalFormat df = new DecimalFormat("0.00");

		df.setRoundingMode(RoundingMode.DOWN);
        String s1 = df.format(f1);
        String s2 = df.format(f2);  

        System.out.println(s1+" "+s2);

        f1 = Float.valueOf(s1);
        f2 = Float.valueOf(s2);
        System.out.println("f1: "+f1+" f2: "+f2);*/

	
}