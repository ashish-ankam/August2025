package threads;
interface FI2
{
	float add(int a, float b);//SAM
	
	default void show()
	{
		System.out.println("shwo");
	}
}
public class LaunchLambda3 
{
	public static void main(String[] args)
	{
//		FI2 fi= (a, b)-> 
//		{
//			return a+b;
//		};
		
		FI2 fi= (a, b) ->  a+b;
//		show(fi);
		
		System.out.println(fi.add(44, 44.5f));
		System.out.println("********************");
		
		show((a, b) ->  a+b);
	
	}
	public static void show(FI2 fi)
	{
		System.out.println(fi.add(44, 44.5f));
	}
}
