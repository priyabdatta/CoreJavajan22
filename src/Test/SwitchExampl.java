package Test;

import java.util.Scanner;

public class SwitchExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the String");
		
		String strl = scanner.nextLine();
		
	
		int vowelCount = 0;
		for(int index=0;index<strl.length();index++) {
		
			char temp = strl.charAt(index);
			
			switch(temp) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount = vowelCount+1;
				break;
				
			}	
			
		}	
			
		System.out.println("Total vowels are "+ vowelCount);	
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
