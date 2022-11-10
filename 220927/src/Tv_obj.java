public class Tv_obj
{
	public String TV_brand;
	public int Now_channel;
	public Tv_obj()
	{
		this.TV_brand = "None"; this.Now_channel = 0;
	}
	public Tv_obj(String TV, int channel)
	{
		this.TV_brand = TV; this.Now_channel = channel;
	}
	public void getTvData()
	{
		System.out.println("TV brand : "+this.TV_brand);
		System.out.println("Now Channel : "+this.Now_channel);
	}
	public void getChannel()
	{
		System.out.println(this.TV_brand+" now Channel : "+this.Now_channel);
	}
	public int sumChannel()
	{
		this.Now_channel += 1;
		if (this.Now_channel>20)
		{
			this.Now_channel = 1;
			return this.Now_channel;
		}
		return this.Now_channel;
	}
	public int minusChannel()
	{
		this.Now_channel -=1;
		if (this.Now_channel<1)
		{
			this.Now_channel = 20;
			return this.Now_channel;
		}
		return this.Now_channel;
	}
}