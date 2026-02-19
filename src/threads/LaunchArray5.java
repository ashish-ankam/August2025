import java.util.Arrays;

public class LaunchArray5
{
	public static void main(String[] args) 
	{
// 		int []ar=new int[4];
//		float []ar=new float[4];
		
		double [][]ar=new double[4][3];
 		
 		System.out.println(ar.getClass().getName());
 		String str[]= {"saketh"};
 		int a[]= {4,2,3,5,6,1};
 		//utility ==> Arrays
// 		System.out.println(a);
 		for(int data:a)
 		{
 			System.out.print(data+ " ");
 		}
 		
 		Arrays.sort(a);
 		
 		System.out.println("After sorting");
 		for(int data:a)
 		{
 			System.out.print(data+" ");
 		}
 		System.out.println();
 		int d=Arrays.binarySearch(a, 4);
 		System.out.println(d);
 		
	}

}
