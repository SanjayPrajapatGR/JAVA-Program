class static_block_demo
{
	static int variable_1;   
	static
	{   
		variable_1=1;  
		System.out.println("Static variable value is:"+variable_1); 
	}
}
class static_block
{
	public static void main(String args[])
	{
		static_block_demo st=new static_block_demo();
	}
}