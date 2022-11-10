class Num
{
	int num1 , num2;
	int result;
	Num(int num1, int num2)
	{
		this.num1 = num1; this.num2 = num2;
	}
	void getNums()
	{
		System.out.println("<Now number>");
		System.out.println("num1 = "+this.num1);
		System.out.println("num2 = "+this.num2);
	}
	int getResult()
	{
		return this.result;
	}
}

class Add extends Num
{
	Add(int num1, int num2)
	{
		super(num1, num2);
	}
	void setResult()
	{
		super.result = super.num1 + super.num2;
	}
}

class Sub extends Num
{
	Sub(int num1, int num2)
	{
		super(num1, num2);
	}
	void setResult()
	{
		super.result = super.num1 - super.num2;
	}
}

class Mul extends Num
{
	Mul(int num1, int num2)
	{
		super(num1, num2);
	}
	void setResult()
	{
		super.result = super.num1 * super.num2;
	}
}

class Div extends Num
{
	Div(int num1, int num2)
	{
		super(num1, num2);
	}
	void setResult()
	{
		super.result = super.num1 / super.num2;
	}
}