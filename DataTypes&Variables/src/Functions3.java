import java.util.Scanner;
import java.lang.Math;

public class Functions3 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Base: ");
		double base = Input.nextDouble();
		System.out.print("Exponant: ");
		double exponant = Input.nextDouble();
		
		double result = Math.pow(base, exponant);
		
		System.out.println("Result: " + base + " to the power "
				+ "of " + exponant + " = " + result);
		

	}

}
