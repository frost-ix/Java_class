class IQ_obj
{
	public String name;
	public int number, iq;
	public IQ_obj()
	{
		name=""; number=0; iq=0;
	}
	public IQ_obj(String name, int number,int iq)
	{
		this.name=name; this.number=number; this.iq=iq;
	}
	public String getName()
	{
		return this.name;
	}
	public int getNumber()
	{
		return this.number;
	}
	public float getIq()
	{
		return this.iq;
	}
}