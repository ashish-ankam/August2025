package customexcception;

public class DrivingLicenceMain {

	public static void main(String[] args) {
		DrivingLicenceApp appStart = new DrivingLicenceApp();
		try {
		appStart.TakeInput();
		
		appStart.Validate();
		
		System.out.println("Application Closed Succefully");
		} catch (OverAgeException | UnderAgeException e) {
			
			
			System.out.println("First Mistake, Please Try Again");
			
			try {
				appStart.TakeInput();
				
				appStart.Validate();
				System.out.println("Application Closed Succefully");
				} catch (OverAgeException | UnderAgeException e1) {
					
					
					System.out.println("Second Mistake, Please Try Again");
					
					
					try {
						appStart.TakeInput();
						
						appStart.Validate();
						System.out.println("Application Closed Succefully");
						} catch (OverAgeException | UnderAgeException e2) {
							
							
							System.out.println("Application Closed");
							e2.printStackTrace();
							
							
						}
					
				}
		}

	}

}
