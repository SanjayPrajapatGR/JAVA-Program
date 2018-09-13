class method
{
	static void messege1()
	{
		System.out.println("Static Method 1");
	}
	static void messege2()
	{
		System.out.println("Static Method 2");
	}
}
class static_method
{
	public static void main(String [] args)
	{
		method m=new method();
		m.messege1();
		m.messege2();
	}
}