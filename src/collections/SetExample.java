package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Rick");
		set1.add("Raj");
		set1.add("Meena");
		set1.add("Reena");
		set1.add("Soma");
		set1.add("Tina");
		set1.add(null);
		
		System.out.println(set1);
		
	LinkedHashSet<String> set2 = new LinkedHashSet<String>();	  
	set2.add("Rick");
	set2.add("Raj");
	set2.add("Meena");
	set2.add("Reena");
	set2.add("Soma");
	set2.add("Tina");
	set2.add(null);
	
	System.out.println(set2); 
	
	TreeSet<String> set3 = new TreeSet<String>();
	set3.add("Rick");
	set3.add("Raj");
	set3.add("Meena");
	set3.add("Reena");
	set3.add("Soma");
	set3.add("Tina");
	//set3.add(null we can not add null value to tree set
	
	System.out.println(set3);
	
		
	}

}
