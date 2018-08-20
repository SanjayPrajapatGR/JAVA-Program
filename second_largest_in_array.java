import java.util.Scanner;
class second_largest_in_array
{
	public static void main(String [] args)
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of the array");
		int n=s.nextInt();
		int array[]=new int[n];
		for(i=0;i<n;i++)                  //get the array
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<n;i++)                 // sort the array
		{
			for(j=0;j<n-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array is:");
		for(i=0;i<n;i++)                //print the sorted array
		{
			System.out.println(""+array[i]);
		}
		for(i=0;i<n;i++)               // find the second element
		{
			if(i==(n-2))
			{
				System.out.println("Second largest number is:"+array[i]);
			}
		}
	}
}