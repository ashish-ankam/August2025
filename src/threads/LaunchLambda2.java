package threads;
interface FI
{
	int lengthOfWord(String name);
}

class FIimpl implements FI
{
	public int lengthOfWord(String name)
	{
		return name.length();
	}
}
public class LaunchLambda2
{
	public static void main(String[] args)
	{
//		FI fi1=new FIimpl();
//		System.out.println(fi1.lengthOfWord("Telusko"));
		
//		FI fi1=new FI() 
//		{
//			public int lengthOfWord(String name)
//			{
//				return name.length();
//			}
//		};
//		System.out.println(fi1.lengthOfWord("Telusko"));
		
//		FI f= (String name) -> 
//		{
//			 return name.length();
//		};
		
		FI f= name ->  name.length();
		
		
		
		System.out.println(f.lengthOfWord("Telusko"));
		
	}
}
