package hello;

public class IterativeSearch2 {
	private static String[] elements = {"Vaibhav","Vaibhav M.","Jaskirat","Prince","Sukrut","Sumit S."};
	
	public static int iterativeSearch (String[] elements2, String goal) {
		
		Arrays.sort(elements);
		int ndx = 0;
		while (ndx< elements.length && elements[ndx]!=(goal)) ndx++;
		if (ndx >= elements.length) return -1;
		if (goal.matches(elements[ndx])) return ndx;
		else return -1;
	}

	public static void main(String[] args) {
		String goal = "Sukrut";
		int result = iterativeSearch(elements,goal);
		if (result<0)
			System.out.println("The goal could not find:" +""+ goal);
		else
			System.out.println("The goal of" + ""+goal +""+ "was found at index:" + result);
	}

	}

