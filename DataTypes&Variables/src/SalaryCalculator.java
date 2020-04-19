import java.util.Scanner;

public class SalaryCalculator {
	
	public static double grossPay(double noHoursWorked, double payPerHour, double vacationDays) {
		if (noHoursWorked < 0) {
			return (-1);
		}
		
		if (payPerHour < 0) {
			return (-1);
		}
		
		double hoursWorkedYear = (noHoursWorked * 52);
		double grossPayPerYear = (payPerHour * hoursWorkedYear);
		double vacationToDeduct = (vacationDays * payPerHour);
		double result = (grossPayPerYear - vacationToDeduct);
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter number of hours worked: ");
		double noHoursWorked = Input.nextDouble();
		System.out.print("Enter pay per hour: ");
		double payPerHour = Input.nextDouble();
		System.out.print("Enter number of vacation days: ");
		double vacationDays = Input.nextDouble();
		
		double yearlyPay = grossPay(noHoursWorked,payPerHour,vacationDays);
		if (yearlyPay < 0) {
			System.out.println("Your input is invalid, please try again.");
		} else {
			System.out.println("Yearly pay = £" + yearlyPay);
		}

	}

}
