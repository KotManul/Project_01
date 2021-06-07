package semesterCredit;

import java.util.Scanner;

public class SemestrCredit {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//ask user name
		System.out.println("Hi! What's your name?");
		String userName =keyboard.nextLine();
		// System.out.println("your name is:" + userName);
		
		//ask how many credits are required to complete a degree
		System.out.println("Hi " + userName + " !");
		System.out.println("How many total credits do you need to complete degree?" );
		int total_credits = Integer.parseInt(keyboard.nextLine());
		
		//ask how many credits already complete 
		System.out.println("Hi " + userName + " !");
		System.out.println("How many credits did you already complete?" );
		int already_credits = Integer.parseInt(keyboard.nextLine());
		
		//ask how many credits in each semester 
		System.out.println("Hi " + userName + " !");
		System.out.println("How many credits do you usually take in one semester?" );
		int creditsPerSemester = Integer.parseInt(keyboard.nextLine());
		
		//ask about cost for one credit 
		System.out.println("Hi " + userName + " !");
		System.out.println("How much do you usually pay for one credit?" );
		int costPerCredit = Integer.parseInt(keyboard.nextLine());
		
		// calculate total number of remaining semesters and remain cost
		int semester_Left = (total_credits - already_credits)/creditsPerSemester;
		int totalRemainCost = (total_credits - already_credits)*costPerCredit;
		
		// print total number of remain semesters and total remain cost to complete degree
		System.out.println("Hi " + userName + " !");
		System.out.println("You have " + semester_Left + " more semesters left to take" );
		System.out.println("Your total cost for the remaining semesters will be  " + totalRemainCost);
		System.out.println("Thank you for using our service !");
		
	}
}
