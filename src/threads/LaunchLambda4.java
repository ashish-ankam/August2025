package threads;
interface ICourse
{
	String course(String name);
}
public class LaunchLambda4 
{
	public static void main(String[] args) 
	{
//		ICourse course= (String name) -> {
//			
//			return "The duration of "+name+ " is 5 months";
//		};
//		
//		courseInfo(course);
		
//		ICourse course= name -> "The duration of "+name+ " is 5 months";
//		
//		courseInfo(course);
		
		courseInfo(name -> "The duration of "+name+ " is 5 months");
	}
	public static void courseInfo(ICourse course)
	{
		System.out.println("Duration is "+ course.course("Java"));
	}
}
