class Human
{
	// IF SAME PKG ?
	// Non public == Public

	// Boolean :: 1 >> Man / 0 >> Woman
	String name, Job, Blood;
	boolean Gender;
	int Age;

	public void doEat()
	{
		System.out.println("Eat something");
	}
	public void doSleep()
	{
		System.out.println("Do sleep");
	}
	public void doTalk()
	{
		System.out.println("Do talk something");
	}
	public void doWalk()
	{
		System.out.println("Do walk somewhere");
	}
	public void getData()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Job : "+this.Job);
		System.out.println("Blood : "+this.Blood);
		System.out.println("Gender : "+this.Gender);
		System.out.println("Age : "+this.Age);
	}
}