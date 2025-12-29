package threads;

public class ThreadsPractice extends Thread {
    @Override
	public void run() {
       for(int i =0 ;i <5;i++) {
		System.out.println("inside child run method.");
	}
    }
	
	public static void main(String[] args) {
		
		 ThreadsPractice t = new ThreadsPractice();
		 Thread t1 = new Thread();
		 t1.start();
		 //t.start();
		 System.out.println("inside main thread...");
		 
		 

	}

}
