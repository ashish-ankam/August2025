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

	public void Validate() throws OverAgeException, UnderAgeException {
		
		if(age<=70 && age >=18) {
			System.out.println("Valid age proceed further");
			}
		
		else if(age>70){
			OverAgeException oe = new OverAgeException("Please Enter the age correctly less than 70");
			throw oe; 
			
		}
		else {
			UnderAgeException ue = new UnderAgeException("Please enter the age above 18 years");
			throw ue;
		}
	}
}
