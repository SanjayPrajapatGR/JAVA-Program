import java.util.Scanner;
class power_claculating
{
	static float power(float x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		else if(y%2==0)
		{
			return power(x,y/2)*power(x,y/2);
		}
		else
		{
			if(y>0)
			{
				return (x*power(x,y/2)*power(x,y/2));
			}
			else
			{
				return (power(x,y/2)*power(x,y/2))/x;
			}
		}
	}
}
class power_of_negative_in_logn
{
	public static void main(String [] args)
	{
		/*float x=7;
		int y=-2;*/
		Scanner s=new Scanner(System.in);
		float x=s.nextFloat();
		int y=s.nextInt();
		power_claculating n=new power_claculating();
		long start=System.nanoTime();
		double ans=n.power(x,y);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("power is:"+ans);
		System.out.println("execution_time is:"+time);
	}
}