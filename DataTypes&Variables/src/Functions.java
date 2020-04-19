import java.util.Scanner;

public class Functions {

	public static void announceDeveloperTeaTime() {
		System.out.println("Working....waiting for tea time!");
		System.out.println("Type in a random word, press Enter and "
				+ " tea time will be announced: ");
		Scanner Input = new Scanner(System.in);
		Input.hasNext();
		System.out.println("It's tea time!");
		System.out.println();
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome, you may begin work...");
		System.out.println("Working...");
		System.out.println("Working...");
		announceDeveloperTeaTime();
		System.out.println("Back to work now.");

	}

}
