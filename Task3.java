import java.util.Scanner;

public class Task3 {

	static String name;
	static String family;
	static String middle;
	static String given;

	public static void main(String args[]) {

	Scanner keybord= new Scanner(System.in); 
	given= keybord.nextLine();
	middle= keybord.nextLine();
	family= keybord.nextLine();

	if(!family.equals(""))
	{
	              if(given.equals("") && middle.equals(""))
	                   System.out.println(family);
	              else if(given.equals(""))
	                   if(middle.equals(""))
	                   System.out.println(family );
	                 else
	                   System.out.println(family + ", " + middle);

	              else if(middle.equals(""))
	                   if(given.equals(""))
	                   System.out.println(family + ", ");
	                 else
	                   System.out.println(family + ", " + given);
	                 else
	                   System.out.println(family + ", "+given+ " " + middle);
	              
	              }
	keybord.close();
	
	}
}
