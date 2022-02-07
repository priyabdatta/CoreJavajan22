package Test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse String
		//reversal of Array
		//reversal of number
		
		String strl = "Clean India Green India";
		String revStrl = "";
		
		for(int index=strl.length()-1;index>0;index--) {
			revStrl = revStrl + strl.charAt(index);
			
			
		}
		System.out.println("Reversed String " + revStrl );
		
		//Numbers of vowels
		
		int result = 0;
		
		for(int index=0;index<strl.length();index++) { 
			
			if(strl.charAt(index)=='a'|| strl.charAt(index)=='e'|| strl.charAt(index)=='i'|| strl.charAt(index)=='o'|| strl.charAt(index)=='u'){
					result++;
			}
		}
	
	
		//reversal of array
		int[] array1 = {20,30,40,50,60};
	
		for(int index=array1.length-1;index>=0;index--) {
			System.out.println((array1[index]));
		}
		
		//reversal of number
		int num5 = 452356;
		int rev = 0;
		
		while(num5>0) {
		
		int remainder = num5%10;
		rev = rev*10 + remainder;
		num5 = num5/10;    //45235
		
		
	}
		System.out.println("The reverse value" + rev);
	
	
	}

}

