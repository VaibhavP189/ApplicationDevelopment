package CALCULATOR;
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
        
        double plus = first + second;
        double minus = first - second;
        double errorterm = firsterror + seconderror;


        System.out.println("Summation for " + first + " and " + second
                + " is: \t\t" + plus);
        System.out.println("Error Term for submmation of" + first + "and" + second + "is:\t\t" + errorterm);
        
        System.out.println("Subtraction for " + first + " and " + second
                + " is: \t\t" + minus);
        System.out.println("Error Term for subtraction of" + first + "and" + second + "is:\t\t" + errorterm);
    }
}
