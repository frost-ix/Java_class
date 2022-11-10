class Car_obj
{
	public String brand, color;
	public int speed;
	public Car_obj()
	{
		this.brand = "Annoymous"; this.color = "None"; this.speed = 0;
	}
	public Car_obj(String b, String c, int s)
	{
		this.brand = b; this.color = c; this.speed = s;
	}
	public int sumSpeed(int _s)
	{
		this.speed += _s;
		return this.speed;
	}
	public void doRun()
	{
		System.out.println(this.brand+"'s speed is now "+this.speed);
	}
	public void doStop()
	{
		System.out.println(this.brand+"is stop");
	}
	public void getCarData()
	{
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
	}
}