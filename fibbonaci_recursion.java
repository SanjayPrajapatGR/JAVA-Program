import java.util.Scanner;
import java.lang.Math;
class fibo
{
	static int a=0,b=1,c;
	void fibonacci(int upper)
	{
		if(upper>=1)
		{
			if(c<upper)
			{
				c=a+b;
				System.out.println(""+c);
				a=b;
				b=c;
				fibonacci(upper-1);
			}
		}
	}
}
class fibbonaci_recursion
{
	static int a=0,b=1,c;
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the upper bound");
		int upper=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		fibo f=new fibo();
		f.fibonacci(upper);
	}
}