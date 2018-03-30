package searchExamples;

import java.util.ArrayList;
import java.util.Collections;

public class W12_C3_DecendingOrder {
	public static void main(String[] args)
	{
	ArrayList<String>	testList =new ArrayList<String>();
	ArrayList<Double> testList1= new ArrayList<Double>();
	ArrayList<Float> testList2= new ArrayList<Float>();
	
	
	testList.add("Vaibhav");
	testList.add("Vaibhav");
	testList.add("Prince");
	testList.add("Sukrut");
	testList.add("Jaskirat");
	testList.add("Sumit");
	
	testList1.add(0.22);
	testList1.add(0.41);
	testList1.add(.72);
	testList1.add(0.89);
	testList1.add(0.12);
	testList1.add(0.5);

	testList2.add(0.22f);
	testList2.add(0.41f);
	testList2.add(0.72f);
	testList2.add(0.89f);
	testList2.add(0.12f);
	testList2.add(0.5f);

	Collections.sort(testList);
	Collections.reverse(testList);
	
	Collections.sort(testList1);
	Collections.reverse(testList1);
	
	Collections.sort(testList2);
	Collections.reverse(testList2);
	
	System.out.println("Collection of sort String"); 
	System.out.println( testList);
	
	System.out.println("Collection of sort Double"); 
	System.out.println( testList1);
	
	System.out.println("Collection of sort Float"); 
	System.out.println( testList2);
	}
}
