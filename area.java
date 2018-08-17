import java.util.Scanner;
class overload
{
	double rectangle,square,cylinder;
	void rectangle(double r, double h)
	{
	    rectangle=r*h;
		System.out.println("the area of the rectangle is:"+rectangle);
	}
    void square(double r)
	{
		square=r*r;
		System.out.println("the area of the square is:"+square);
	}
	void cylinder(double r,double h,double pi)
	{
		cylinder=(2*pi*r*h)+(2*pi*r*r);
		System.out.println("the area of the cylinder is:"+cylinder);
	}
}
class area
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		overload o=new overload();
		
		System.out.println("enter the radius");
		double r=s.nextDouble();
		System.out.println("enter the hight");
		double h=s.nextDouble();
		System.out.println("enter the value of pi");
		double pi=s.nextDouble();
		
		o.rectangle(r,h);
		o.square(r);
		o.cylinder(r,h,pi);		
	}
}