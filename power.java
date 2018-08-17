import java.util.Scanner;
class pow
{
	float getdata(float base, float exponent)
	{
		float power=1;
		for(int i=1;i<=exponent;i++)
		{
			power = power * base;
		}
		System.out.println(""+power);
		return l;
	}
}
class power
{
	public static void main(String [] args)
	{
		Scanner a=new Scanner(System.in);
		float x=a.nextFloat();
		float y=a.nextFloat();
		pow v=new pow();
		float z=v.getdata(x,y);
		System.out.println("power is:"+z);
	}
}