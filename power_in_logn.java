import java.util.Scanner;
class power_claculate
{
	long power(long x, long y)
	{
		if(y==0)
		{
			return 1;
		}
		
		else if(y%2 == 0)
		{
			return (power(x,y/2)*power(x,y/2));
		}
		else
		{
			return (x*(power(x,y/2)*power(x,y/2)));
		}
	}
}
class power_in_logn
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		long x=s.nextInt();
		long y=s.nextInt();
	
		power_claculate p=new power_claculate();
		long start=System.nanoTime();
		long a=p.power(x,y);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("power is:"+a);
		System.out.println("execution_time is:"+time);
	}
}