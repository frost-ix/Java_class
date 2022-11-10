abstract class Cal
{
	public abstract int add(int num1, int num2);
	public abstract int subtract(int num1, int num2);
	public abstract double avg(double nums[]);
}

class GoodCal extends Cal
{
	@Override
	public int add(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1+num2;
	}
	@Override
	public int subtract(int num1, int num2)
	{
		// TODO Auto-generated method stub
		return num1-num2;
	}
	@Override
	public double avg(double nums[])
	{
		// TODO Auto-generated method stub
		double result=0;
		for (int i = 0; i < nums.length; i++)
		{
			result += nums[i];
		}
		return (double)result/nums.length;
	}
}