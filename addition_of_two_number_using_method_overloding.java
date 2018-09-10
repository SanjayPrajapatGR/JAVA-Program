import java.util.Scanner;
class addition
{
	int x,y;
	float q,w;
	void add(int a,int b)
	{
		x=a;
		y=b;
		int z=x+y;
		System.out.println("Addition of two integer number is:"+z);
	}
	void add(float a,float b)
	{
		q=a;
		w=b;
		float e=q+w;
		System.out.println("Addition of two float number is:"+e);
	}
}
class addition_of_two_number_using_method_overloding
{
	public static void main(String [] args)
	{
		addition m=new addition();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer number");
		int a=s.nextInt();
		int b=s.nextInt();
		m.add(a,b);
		
		System.out.println("enter the float number");
		float c=s.nextFloat();
		float d=s.nextFloat();
		m.add(c,d);
	}
}
		
