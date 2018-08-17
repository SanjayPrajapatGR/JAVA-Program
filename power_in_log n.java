import java.util.Scanner;
class power_claculate
{
	int power(int x, int y)
	{
		int temp;
		if(y==0)
		{
			return 1;
		}
		temp=power(x,y/2);
		else if(y%2 == 0)
		{
			return (temp*temp);
		}
		else
		{
			return (x*(temp*temp);
		}
	}
}
class power_in_O(log n)
{
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	
	power_claculate p=new power_claculate();
	p.power_claculate(x,y);
}