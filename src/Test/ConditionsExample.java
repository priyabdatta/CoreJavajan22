package Test;

import java.util.Scanner;
public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the Age ");
		
		int age = scanner.nextInt();
		
		if (age>=18) {
			System.out.println("you are eligible for voting ");
		} else if(age == 17) {
				System.out.println("yor are not eligible for voting this yer , try doing next year");

		} else {
			int eligibleYear = 18 -age;
			System.out.println("you are not eligible for voting this year "+ eligibleYear);
		}
		scanner.close();
		
	}

}
