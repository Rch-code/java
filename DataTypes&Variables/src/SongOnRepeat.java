import java.util.Scanner;

public class SongOnRepeat {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		boolean isOnRepeat = true;
		
		while (isOnRepeat){
			System.out.println("Playing current song...");
			System.out.println("Would you like to turn off repeat?"
					+ " If you would, enter yes: ");
			String userInput= Input.next();
			
			if (userInput.contentEquals("yes")) {
				isOnRepeat = false;
			}
		}
		System.out.println("Playing next song...");
				
	}

}
