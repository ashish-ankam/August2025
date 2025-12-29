package threads;
/*
 * Highest priority number , it will get highest priority and it will be executed first by Thread Scheduler 
 * 
 * 
 * 

*/
public class Thread2  extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside Child Thread , its Priority is : " + Thread.currentThread().getPriority());
		System.out.println("Inside Child Thread Name  : " +  Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Thread2 t = new Thread2();
		t.start();
		System.out.println("Inside Main Thread its Priority is " + Thread.currentThread().getPriority() + " and its Name is :  " + Thread.currentThread().getName());
         
	}

}
