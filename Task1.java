	import java.util.Scanner;
public class Task1 {

	 public static void main (String args[]) {
		 int a = 5;
		 int b = 7;
		 double bill=0;
		 System.out.println("Enter the Units used in month");
		 Scanner keyboard = new Scanner(System.in);
		 double unit = keyboard.nextDouble();
		 if (unit <= 400 ) 
		 bill = unit * a;
		 else
			 bill = unit*b;
		 System.out.println("Bill is : " + bill);
	 }
	}

