interface phone
{
	final int OUT = 10000;
	void sendCall(String inside);
	void recCall();
	default void printLogo(String logo)
	{
		System.out.println(logo+" Phone");
	}
}
interface mobile extends phone
{
	void sendMail(String inside);
	void recMail();
	void search(String inside);
}

interface MP3
{
	public void play(String name);
	public void stop(String name);
}

class PDA
{
	public int cal(int x, int y)
	{
		return x+y;
	}
}

class smart extends PDA implements mobile, MP3
{
	@Override
	public void printLogo(String logo)
	{
		mobile.super.printLogo(logo);
	}
	@Override
	public void sendCall(String inside)
	{
		System.out.println(inside+" go calling");
	}
	@Override
	public void recCall()
	{
		System.out.println("get call");
	}
	@Override
	public void sendMail(String inside)
	{
		System.out.println(inside+" Go mail");
	}
	@Override
	public void recMail()
	{
		System.out.println("get mail");
	}
	@Override
	public void play(String name)
	{
		System.out.println(name+" Play music");
	}
	@Override
	public void stop(String name)
	{
		System.out.println(name+" Stop music");
	}
	@Override
	public void search(String inside)
	{
		System.out.println("Talk "+inside);
	}
	
	public void schedule()
	{
		System.out.println("Go schedule");
	}
}