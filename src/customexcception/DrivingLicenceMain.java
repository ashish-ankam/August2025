package customexcception;

public class DrivingLicenceMain {

	public static void main(String[] args) {
		DrivingLicenceApp appStart = new DrivingLicenceApp();
		try {
		appStart.TakeInput();
		
		appStart.Validate();
		
		System.out.println("Application Closed Succefully");
		} catch (OverAgeException | UnderAgeException e) {
			
			System.out.println("1 more Chance , Application proceed");
			e.printStackTrace();
			
			try {
				appStart.TakeInput();
				
				appStart.Validate();
				
				System.out.println("Application Closed Succefully");
				} catch (OverAgeException | UnderAgeException e1) {
					
					System.out.println("Chances are Over , Application locked");
					e1.printStackTrace();
					System.out.printf("Nested Exception");
					
				}
			
		}
		
	}

}
