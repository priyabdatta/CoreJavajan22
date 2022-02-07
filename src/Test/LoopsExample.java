package Test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While Loop to print to 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
		
			if(num1==5) {
				num1 = num1+1;
				continue;
			}
		
		System.out.println(num1);
		num1 = num1+1;
	
		}
		
		//For Loop to type 1 to 10
		for(int count =1;count<=10;count++){
			
			if(count==5) {
				continue;
			}
			
			System.out.println("inside for loop" + count);
		}
			//For Loop to type 10 to 1
		for(int count =10; count>=1;count--) {
				System.out.println("The count value"+count);
		
		}
		
		int[] array1 = {20,30,40,50};
		for(int index=0;index<array1.length;index++) {
			System.out.println("value inside array" + array1[index]);
		}
		
	}

}
