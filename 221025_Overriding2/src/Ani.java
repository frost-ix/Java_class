class Ani
{
	String name;
	int age;
	Ani()
	{
		this("name", 0);
	}
	Ani(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void getStat()
	{
		System.out.println("Not set animal");
	}
}

class Tiger extends Ani
{
	Tiger(String name, int age)
	{
		super(name, age);
	}

	@Override
	void getStat()
	{
		// TODO Auto-generated method stub
		System.out.println("name : "+super.name);
		System.out.println("age : "+super.age);
	}
}
class Monkey extends Ani
{
	Monkey(String name, int age)
	{
		super(name, age);
	}

	@Override
	void getStat()
	{
		// TODO Auto-generated method stub
		System.out.println("name : "+super.name);
		System.out.println("age : "+super.age);
	}
}
class Girf extends Ani
{
	Girf(String name, int age)
	{
		super(name, age);
	}

	@Override
	void getStat()
	{
		// TODO Auto-generated method stub
		System.out.println("name : "+super.name);
		System.out.println("age : "+super.age);
	}
}