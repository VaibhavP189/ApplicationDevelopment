package Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PowerSolutions {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter your Measured value: ");
        double first = input.nextDouble();

        System.out.println("Enter your error term value: ");
        double firsterror = input.nextDouble();
        System.out.println("Enter your value for n: ");
        double n = input.nextDouble();
        

        
       
        
        double Value1 = Math.abs(first);
        double errorValue1 = Math.abs(firsterror);
        double errorFraction = errorValue1 / Value1;
        double n1 = Math.abs(n);
        double powerValue= Math.pow(first, n);
        double powerValue1 = Math.abs(powerValue);
        double powerErrorTerm = n1 * errorFraction * powerValue1;
        
    
        DecimalFormat roundoffPET = new DecimalFormat("####.###");
        String roundedPET = roundoffPET.format(powerErrorTerm);
        
        System.out.println("Value of term" + first + firsterror + "" + "with power" + "" + n 
                + " is: \t\t" + powerValue +"\t"+ "±"+"\t"+ roundedPET);

    }
}
