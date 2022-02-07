package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Donald");
		list1.add("Jack");
		list1.add("Jack");
		list1.addFirst("Nick");
		list1.addLast("Rick"); 
		list1.add(3,"Bharat");
		System.out.println(list1);
		
		for(int index=0;index<list1.size();index++) {
			
		System.out.println(list1.get(index));	
	}
		
	}
}
