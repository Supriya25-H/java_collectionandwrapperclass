class Demo
{
	public static void main(String arg[])
	{
		char c[]={'a','b','c','d','e'};
		String s=new String(c);
		System.out.println(s);
		//System.out.println(s.String(c,0,4));
		System.out.println("length of string"+s.length());
		String s1=new String("-Alphabet");
		String s2=s+s1;
		System.out.println("modified string="+s2);
		System.out.println(s2.charAt(3));
		String str=s2.substring(0,5);
		System.out.println("String="+str);
		System.out.println(s.toUpperCase());
		//System.out.println("b is present in-"+s2.indexOf(b));
	}
}
