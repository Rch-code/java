import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Ask a question with three possible outcomes
		String Q1 = "Q1. When is my birthday?";
		String AnsA = "A. May 5th";
		String AnsB = "B .October 20th";
		String AnsC = "C. January 29th";
		
		System.out.println(Q1);
		//ASk the question and collect the input from the user
		Scanner Choice = new Scanner(System.in);
		String UserChoice = Choice.next();	
		//If the user answers correctly let them know, otherwise 
		//show them the correct answer.
		
		if (UserChoice.contentEquals("C")| UserChoice.contentEquals("c")) {
			System.out.println("Correct! The answer is " + AnsC);
			
		}
		else System.out.println("Incorrect, the answer was " + AnsC);		
				
	}

}
