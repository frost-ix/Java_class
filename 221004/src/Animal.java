import java.util.Scanner;

public class Animal
{
	static Scanner input_sc = new Scanner(System.in);
	public static void singleControl()
	{
		// Lion OBJECT
		AnimalOBJ Lion = new AnimalOBJ();

		System.out.print("Input Animal Name >> "); Lion.setName(input_sc.next());
		System.out.print("Input Animal Age >> "); Lion.setAge(input_sc.nextInt());

		System.out.println("First Object Name : "+Lion.getName());
		System.out.println("First Object Age : "+Lion.getAge());

		// Dog OBJECT
		AnimalOBJ Dog = new AnimalOBJ();

		System.out.print("Input Animal Name >> "); Dog.setName(input_sc.next());
		System.out.print("Input Animal Age >> "); Dog.setAge(input_sc.nextInt());
		System.out.print("Input Animal Kg >> "); Dog.setKg(input_sc.nextFloat());
		
		System.out.println("Second Animal Name : "+Dog.getName());
		System.out.println("Second Animal Age : "+Dog.getAge());
		System.out.println("Second Animal Kg : "+Dog.getKg());
	}

	public static void arrControl()
	{
		AnimalOBJ animal_mem[] = new AnimalOBJ[3];

		animal_mem[0] = new AnimalOBJ("cat",3,3.55F);
		animal_mem[1] = new AnimalOBJ("monkey",6,6.55F);
		animal_mem[2] = new AnimalOBJ("sheep",1,7.55F);
		
		getArrObj(animal_mem);
	}
	public static void getArrObj(AnimalOBJ arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Name : "+arr[i].getName());
			System.out.println("Age : "+arr[i].getAge());
			System.out.println("Kg : "+arr[i].getKg());
		}
	}
}