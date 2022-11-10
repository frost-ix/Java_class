class Method_overlodaing
{
	int num1, num2, num3;
	double num4, num5;
	Method_overlodaing()
	{
		this(0,0, 0);
		this.num4 = 0;
		this.num5 = 0;
	}
	Method_overlodaing(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}
	Method_overlodaing(int num1, int num2, int num3)
	{
		this.num1 = num1; this.num2 = num2; this.num3 = num3;
	}
	Method_overlodaing(double num4, double num5)
	{
		this.num4 = num4; this.num5 = num5;
	}
	int getSum(int num1, int num2)
	{
		int result = num1+num2;
		return result;
	}
	int getSum(int i[], int size)
	{
		int result=0;
		for (int j = 0; j < size; j++) 
		{
			result += i[j];
		}
		return result;
	}
	int getSum(int num1, int num2, int num3)
	{
		int result = num1 + num2 + num3;
		return result;
	}
	double getSum(double num4, double num5)
	{
		double result = num4 + num5;
		return result;
	}
}