import java.util.Calendar;

public class Car {
	String make;
	String model;
	int year;
	boolean isNew;
	double miles;
	String owner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car ();
		mycar.make = "Audi";
		mycar.model = "A4";
		mycar.year = 2014;
		mycar.miles = 0;
		mycar.isNew = true;
		mycar.owner = "Arvind";
		boolean isMyCarOld = mycar.isOld();
		mycar.sell("John Doe");
		System.out.println("Car owned by " + mycar.owner);
		
	}
	public void sell(String newOwner) {
			owner = newOwner;
			if (isNew) {
				isNew = false;
			}
	}
	public boolean isOld() {
		int thisYear = 
				Calendar.getInstance().get(Calendar.YEAR);
				if (thisYear - year > 10) {
					return true;
				}
				else {
					return false;
				}
	}

}
