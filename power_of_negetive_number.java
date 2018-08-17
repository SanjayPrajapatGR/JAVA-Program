import java.util.Scanner;
class pow
{
	float getdata(float base, float exponent)
	{
		float power=1;
		float c=exponent*(-1);
		for(int i=1;i<=c;i++)
		{
			power = power * base;
		}
		System.out.println(""+power);
		float l=1/power;
		return l;
	}
}
class power_of_negetive_number
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