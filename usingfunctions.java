class Demo
{
	public static void main(String arg[])
	{
		ArrayList <String> a=new ArrayList<String>();
		System.out.println("Initial size of a:"+a.size());
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");
		System.out.println("contents of a:"+a);
		a.add(1,"A2");
		System.out.println("size of a after addition:"+a.size());
		System.out.println("contents of a:"+a);
		a.remove("F");
		a.remove(2);
		System.out.println("size of a after delition:"+a.size());
		System.out.println("contents of a:"+a);
	}
}