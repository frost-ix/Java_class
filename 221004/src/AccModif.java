class AccModif
{
	// Private : Only in this class
	// Default (Empty) : Use in same pakage
	// Public : All class with other pakage
	// Protected : Same class & extends (implements)

	// private int number_priv;
	int number_df;
	protected int number_protec;
	public double number_pub;
	private String name_private;

	AccModif()
	{
		this(" ");
	}
	AccModif(String name_private)
	{
		this.name_private = name_private;
	}
	void show()
	{
		System.out.println("Name : "+name_private);
	}
	String getName()
	{
		return name_private;
	}
	void setName(String name_private)
	{
		this.name_private = name_private;
	}
}