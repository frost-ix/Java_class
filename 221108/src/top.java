interface top
{
	// Phantom public static final
	public static final int num = 100;
	int num2 = 200;

	// Phantom public abstract
	public abstract void show();
	void show2();

	default void print()
	{
		System.out.println("normal");
	}
}

interface middle extends top
{
	float number = 1.5F;
	void disp();
}

interface bottom extends middle
{
	double number_format = 2.5;
}

class data
{
	int nasty;
}