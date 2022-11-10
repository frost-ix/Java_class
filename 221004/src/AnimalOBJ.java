class AnimalOBJ
{
	String Name;
	int Age;
	float Kg;

	AnimalOBJ() { this("Not set", 0, 0); }

	AnimalOBJ(String Name,int Age)
	{
		this.Name = Name; this.Age = Age;
	}

	AnimalOBJ(String Name, int Age, float Kg)
	{
		this.Name = Name; this.Age = Age; this.Kg = Kg;
	}

	String getName()
	{
		return Name;
	}
	int getAge()
	{
		return Age;
	}
	float getKg()
	{
		return Kg;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setAge(int Age)
	{
		this.Age = Age;
	}
	void setKg(float Kg)
	{
		this.Kg = Kg;
	}

	void introduce()
	{
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
	}
	void eat()
	{
		System.out.println(Name + "is now Eat");
	}
	void speak()
	{
		System.out.println(Name + "is now Speak !!");
	}
}
