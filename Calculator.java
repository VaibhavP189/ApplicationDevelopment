package CALCULATOR;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculator {


	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter your first integer value: ");
        double first = input.nextDouble();

        System.out.println("Enter your first error term value: ");
        double firsterror = input.nextDouble();
        
        System.out.println("Enter your second integer value: ");
        double second = input.nextDouble();

        System.out.println("Enter your second error term value: ");
        double seconderror = input.nextDouble();

        double mpy = first * second;
        double div = first / second;

        double errorterm1 = Math.abs((firsterror / first + seconderror / second) * mpy);
        double errorterm2 = (firsterror / first + seconderror / second) * div;
        
        String errortermdiv = String.valueOf(Math.abs(errorterm2));
        DecimalFormat roundoffMpy = new DecimalFormat("####.##");
        String roundedMpy = roundoffMpy.format(errorterm1);
        
        
     
        System.out.println("Multiplication for " + first + " and " + second
                + " is: \t\t" + mpy);
        System.out.println("Error Term for Multiplication of" + first + "and" + second + "is:\t\t" + roundedMpy);
        
        System.out.println("Division for " + first + " and " + second
                + " is: \t\t" + div);
        System.out.println("Error Term for Division of" + first + "and" + second + "is:\t\t" + errortermdiv);   


    }
}
