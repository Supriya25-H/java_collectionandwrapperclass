//converting arraylist to array
import java.util.*;
class Demo
{
	public static void main(String arg[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("contents of a:"+a);
		Integer ia[]=new Integer[a.size()];
		ia=a.toArray(ia);
		int sum=0;
		for(int i:ia)
			sum+=i;
		System.out.println("Sum is:"+sum);
	}
}
		



		
