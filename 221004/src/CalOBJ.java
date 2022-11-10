class Plus
{
	private int num1, num2;
	
	Plus()
	{
		this(0,0);
	}
	Plus(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}

	void setValue(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	void getValue()
	{
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	int getPlus()
	{
		return num1+num2;
	}
}
class Sub
{
	private int num1, num2;
	
	Sub()
	{
		this(0,0);
	}
	Sub(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}

	void setValue(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	int getSub()
	{
		return num1-num2;
	}
}
class Mul
{
	private int num1, num2;
	
	Mul()
	{
		this(0,0);
	}
	Mul(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}

	void setValue(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	int getMul()
	{
		return num1*num2;
	}
}
class Div
{
	private int num1, num2;
	
	Div()
	{
		this(0,0);
	}
	Div(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}

	void setValue(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	float getDiv()
	{
		return (float)num1/num2;
	}
}