class Demo
{
	public static void main(String arg[])
	{
		char[] ch={'a','b','c','d'};
		String s1=new String(ch);
		System.out.println(s1);
		String s2="abcd";
		System.out.println(s2);
		System.out.println("s1==s2"+s1==s2);
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		s1=s2;
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("length="+s1.length());
		System.out.println("length="+"welcome".length());
	}
}