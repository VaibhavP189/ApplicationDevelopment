	import java.util.Scanner;

	public class Task2 {

	public static void main(String args[]) {
		int week;
		int day;
		System.out.println("Input number of days remain : " );
		Scanner keyboard = new Scanner(System.in);
		int days = keyboard.nextInt();
		if(days<7)
			System.out.println("Number of days remain: "+ days );
		else
			{week = days/7;
			 day = days % 7;
			 System.out.println(week+" Weeks "+ day+ " Days Remain");
			}
		    
		
	}
	}

