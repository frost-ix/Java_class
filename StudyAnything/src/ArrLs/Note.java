package ArrLs;

class Note
{
	private int Price;
	private String Name;
	public Note()
	{
		this(0, "Empty");
	}
	public Note(int Price, String Name)
	{
		this.Price = Price; this.Name = Name;
	}
	int getPrice()
	{
		return Price;
	}
	String getName()
	{
		return Name;
	}
}