import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {
		System.out.println("Pick a number between 1 and 10: ");
		
		Scanner Input = new Scanner(System.in);
		int inputNum = Input.nextInt();
		
		if (inputNum < 5) {
			System.out.println("Enjoy your good luck!");
		} else {
			System.out.println("Ooooh, sorry...wrong answer");
		}

	}

}
