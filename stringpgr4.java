class Demo
{
	public static void main(String arg[])
	{
		String s1=new String("Hello");
		String s2=new String("Welcome");
		String s3=s1+s2;
		System.out.println("concate="+s3);
		String s=s1.concat(s2);
		System.out.println(s);
		String s4=s2.substring(1,4);
		System.out.println(s4);
	}
}