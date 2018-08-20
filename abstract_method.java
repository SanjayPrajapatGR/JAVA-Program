class abstract_method
{
	public static void main(String [] args)
	{
		mohit_phone phone=new ravi_phone();
		phone.dance();
		phone.move();
		phone.call();
	}
}

abstract class mohit_phone
{
	void call()
	{
		System.out.println("funtion calling");
	}
	public abstract void move();
	public abstract void dance();
}

abstract class ruchit_phone extends mohit_phone
{
	 public void move()
	{
		System.out.println("funtion moving");
	}
	public abstract void dance();
}

class ravi_phone extends ruchit_phone
{
	public void dance()
	{
		System.out.println("funtion dancing");
	}
}