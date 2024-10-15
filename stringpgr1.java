import java.util.*;
class Main
{
	public static void main(String arg[]);
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sc.nextInt();
		int s[]=new int[n];
		System.out.println("enter array of the string");
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		for(int i=0;i<n;i++)
			System.out.println(s[i]);
		String str=new String();
		System.out.println(str.indexOf(String "jaipur"));
		System.out.println(str.lastIndexOf(String "vijaypur",int 2));
		System.out.println("replaced string="+str.replace(char 'v',char 'b'));
		System.out.println(replaceFirst(String "velocity",String "jaipur"));
		int x=str.endsWith(String "ura");
		System.out.println(x);
	}
}