//Functional interface
package threads;

@FunctionalInterface
interface Alien1
{
	void disp();//SAM single abstract method
}
class AlienImpl implements Alien1
{
	public void disp() 
	{
		System.out.println("disp of alien implemented");
	}
	
}
public class LaunchLambda
{
	public static void main(String[] args) 
	{
//		Alien1 a=new AlienImpl();	
//		a.disp();
		
		//anonymous inner class
		
//		Alien1 al=new Alien1()
//				{
//			        public void disp()
//			        {
//			        	System.out.println("telusko.com");
//			        }
//				};
//				al.disp();
		Alien1 al1=  ()->
		{
			System.out.println("Hello From lambda 1");
		};

		Alien1 al2=  ()-> System.out.println("Hello From lambda 2");
		
		al1.disp();
		al2.disp();
			
	}

}
