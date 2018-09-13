import java.util.Scanner;
class Rectangel
{
	void rectangel(float lenth, float width)
	{
		float area=lenth*width;
		float perimeter=2*(lenth+width);
		System.out.println("area of the rectangel is:"+area);
		System.out.println("perimeter of the rectangel is:"+perimeter);
	}
}
class RoundRect extends Rectangel
{
	static double pi=3.14;
	void roundrect(float lenth,float width,float radius)
	{
		double area=(lenth*width)+2*radius*(lenth+width)+(pi*radius*radius);
		float perimeter=2*(lenth+width+(2*radius));
		
		rectangel(lenth,width);
		System.out.println("area of the roundrect is:"+area);
		System.out.println("perimeter of the roundrect is:"+perimeter);
	}
}
class area_and_perimeter_using_inhertance
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		RoundRect r=new RoundRect();
		
		System.out.println("enter the lenth");
		float lenth=s.nextFloat();
		System.out.println("enter the width");
		float width=s.nextFloat();
		System.out.println("enter the radius");
		float radius=s.nextFloat();
		
		r.roundrect(lenth,width,radius);
	}
}