import java.util.Scanner;

class Human_input
{
	static Scanner input_sc = new Scanner(System.in);

	public static void Person_test()
	{
		Human Hwang = new Human();
		Human Lee = new Human();
		Human Kim = new Human();

		setObject(Hwang);
		setObject(Lee);
		setObject(Kim);

		Hwang.getData();
		Lee.getData();
		Kim.getData();
	}
	public static void setObject(Human person)
	{
		person.name = input_sc.next();
		person.Job = input_sc.next();
		person.Gender = input_sc.nextBoolean();
		person.Blood = input_sc.next();
		person.Age = input_sc.nextInt();
	}
}
