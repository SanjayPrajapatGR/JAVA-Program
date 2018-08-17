class constructor_overloading
{
	int x,y;
	int rectangel,square;
    constructor_overloading(int a,int b)
	{
		x=a;
		y=b;
		rectangel=x*y;
		System.out.println("area of the rectangel is:"+rectangel);
	}
    constructor_overloading(int a)
	{
		x=a;
		square=x*x;
		System.out.println("area of the square is:"+square);
	}
}

class constructor 
{
	public static void main(String [] args)
	{
		constructor_overloading l=new constructor_overloading(10);
	}
}
	
