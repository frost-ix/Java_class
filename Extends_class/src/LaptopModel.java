class LaptopModel extends LaptopBrand
{
	private String Model_name;
	private int Model_coast;
	private float Model_Display;

	LaptopModel(String Brand)
	{
		super(Brand); this.Model_name = ""; this.Model_coast = 0; this.Model_Display = 0;
	}

	LaptopModel(String Brand, String Model_name, int Model_coast, float Model_Display)
	{
		super(Brand);
		this.Model_name = Model_name;
		this.Model_coast = Model_coast;
		this.Model_Display = Model_Display;
	}

	public void setModel_name(String Model_name)
	{
		this.Model_name = Model_name;
	}

	public void setModel_coast(int Model_coast)
	{
		this.Model_coast = Model_coast;
	}
	public void setModel_Display(float Model_Display)
	{
		this.Model_Display = Model_Display;
	}

	public String getModel_name()
	{
		return Model_name;
	}

	public int getModel_coast()
	{
		return Model_coast;
	}

	public float getModel_Display()
	{
		return Model_Display;
	}
}