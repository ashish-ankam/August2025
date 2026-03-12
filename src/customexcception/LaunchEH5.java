package customexcception;

import java.util.Scanner;
class Demo
{
	public void divide()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		
			System.out.println("Kindly! Enter numerator to divide");
			int n=sc.nextInt();
			System.out.println("Kindly! Enter denominator");
			int d=sc.nextInt();
			int res=n/d;
			System.out.println("Result is "+ res);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled in divide of demo");
		}
	}
	
}
class Demo2
{
	
	public Demo show(Demo d)
	{
//		Demo d=new Demo();
//		return d;
//		return new Demo();
		return d;
	}
	
	public void disp()
	{
		try
		{
			Demo d=new Demo();
			show(new Demo());
			d.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled in disp demo2");
		}
		
	}
}
public class LaunchEH5 
{
	public static void main(String[] args)
	{
		System.out.println("Calc app started");
		try
		{
			
		Demo2 d=new Demo2();
		d.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in main");
		}
		
		
		System.out.println("Calc app terminated");		
	}

}
