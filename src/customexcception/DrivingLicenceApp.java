package customexcception;

import java.util.Scanner;

public class DrivingLicenceApp {
	String name;
	int age;
	public void TakeInput() {
		System.out.println("Welcome to Driving Licence App");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the name ");
			 name = sc.next();
			System.out.println("enter the age ");
			age = sc.nextInt();
		}
		
		}

	public void Validate() throws OverAgeException {
		if(age<=70) {
			System.out.println("Valid age proceed further");
			}
		else {
			OverAgeException oe = new OverAgeException("Please Enter the age correctly less than 70");
			throw oe; 
		}
	}
}
