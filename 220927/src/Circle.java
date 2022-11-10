class Circle
{
	public String name;
	public int radius;
	public double area, round;

	public Circle()
	{
		name = ""; radius = 1; area=0; round=0;
	}
	// Overloading <Setter Circle local value>
	public Circle(String n, int r)
	{
		this.name = n; this.radius = r;
	}

	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getRound()
	{
		return 2*3.14*radius;
	}
	public void setArea()
	{
		this.area = getArea();
	}
	public void setRound()
	{
		this.round = getRound();
	}
}
