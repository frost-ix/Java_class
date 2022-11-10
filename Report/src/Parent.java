class Parent
{
	private String name;
	private int age;
	Parent()
	{
		this("Sung", 25);
	}
	Parent(String name, int age)
	{
		this.name = name; this.age = age;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void setAge(int age)
	{
		this.age = age;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	void getData()
	{
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
	}
}
