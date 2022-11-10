abstract class Abp
{
	abstract void getPrint();
	abstract int calc(int x, int y);
}

class Abc extends Abp
{
	@Override
	void getPrint()
	{
		System.out.println("Hello");
	}
	@Override
	int calc(int x, int y)
	{
		return x+y;
	}
}

class Abc2 extends Abp
{
	@Override
	void getPrint()
	{
		System.out.println("Good day");
	}
	@Override
	int calc(int x, int y)
	{
		return x-y;
	}
}