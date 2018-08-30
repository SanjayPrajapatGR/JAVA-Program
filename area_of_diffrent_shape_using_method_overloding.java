import java.util.Scanner;
class compute_area
{
	void area(float lenth,float width)
	{
		float a=lenth;
		float b=width;
		float c=a*b;
		System.out.println("area of the rectangel is:"+c);
	}
	void area(float lenth)
	{
		float a=lenth;
		float c=a*a;
		System.out.println("area of the square is:"+c);
	}
	void area(float lenth,double pi)
	{
		float a=lenth;
		double b=pi;
		double c=pi*a*a;
		System.out.println("area of the circle is:"+c);
	}
}
class area_of_diffrent_shape_using_method_overloding
{
	public static void main(String [] args)
	{
		compute_area z=new compute_area();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the lenth:");
		float lenth=s.nextFloat();
		System.out.println("enter the width:");
		float width=s.nextFloat();
		double pi=3.14;
		
		z.area(lenth,width);
		z.area(lenth);
		z.area(lenth,pi);
	}
}