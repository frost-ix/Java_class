class Child1 extends Parent
{
	private String hobby;
	Child1()
	{
		super("name",0); this.hobby = "empty";
	}
	Child1(String name, int age, String hobby)
	{
		super(name, age); this.hobby = hobby;
	}
	@Override
	void setName(String name)
	{
		super.setName(name);
	}
	@Override
	void setAge(int age)
	{
		super.setAge(age);
	}
	void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	String getHobby()
	{
		return hobby;
	}
	@Override
	void getData()
	{
		System.out.println("------------ Child1 Area -----------");
		super.getData();
		System.out.println("Hobby : "+getHobby());
	}
}

class Child2 extends Parent
{
	private String gender;
	Child2()
	{
		// Default Gender = Man
		super("name", 0); this.gender = "man";
	}
	Child2(String name, int age, String gender)
	{
		super(name, age); this.gender = gender;
	}
	@Override
	void setName(String name)
	{
		super.setName(name);
	}
	@Override
	void setAge(int age)
	{
		super.setAge(age);
	}
	String getGender()
	{
		return gender;
	}
	@Override
	void getData()
	{
		System.out.println("------------ Child2 Area -----------");
		super.getData();
		System.out.println("Hobby : "+getGender());
	}
}

class Child3 extends Parent
{
	private String job;
	Child3()
	{
		super("name", 0); this.job = "no job";
	}
	Child3(String name, int age, String job)
	{
		super(job, age); this.job = job;
	}
	@Override
	void setName(String name)
	{
		super.setName(name);
	}
	@Override
	void setAge(int age)
	{
		super.setAge(age);
	}
	String getJob()
	{
		return job;
	}
	@Override
	void getData()
	{
		System.out.println("------------ Child3 Area -----------");
		super.getData();
		System.out.println("Gender : "+getJob());
	}
}