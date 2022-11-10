import java.util.Scanner;

public class OBJControl
{
	static Scanner input_sc = new Scanner(System.in);

	// Laptop : Object
	// BrandName : Name array
	// BrandCount , laptopCount : Count value of each
	// All : BrandCount * laptopCount

	static LaptopModel laptop[];
	static String BrandName[];
	static int BrandCount, laptopCount;
	static int All;
	
	public static void getIntroduce()
    	{
		System.out.println("<Laptop Control program>");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Menual >>");
		System.out.println("First : Input brand name");
		System.out.println("Second : Input Laptop");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("example) Model Name : M1 2021ver");
		System.out.println("example) Model coast : 1699");
		System.out.println("example) Model Display : 13.3");
		System.out.println("------------------------------------------------------------------------");
    	}

	public static void setLength()
	{
		System.out.println("------------------------------------------------------------------------");
		int B_count, L_count;
		System.out.print("Input Brand Count >> "); B_count = input_sc.nextInt();
		System.out.print("Input Laptop Count >> "); L_count = input_sc.nextInt();
		BrandCount = B_count;
		laptopCount = L_count;
		All = BrandCount*laptopCount;
		System.out.println("------------------------------------------------------------------------");
	}

	public static void setBrandName() 
	{
		System.out.println("------------------------------------------------------------------------");
		System.out.println("<Brand Input Area>");
		BrandName = new String[OBJControl.BrandCount];
		for (int i = 0; i < BrandName.length; i++)
		{
			input_sc.nextLine();
			System.out.printf("%d | Brand Name >> ",i);
			BrandName[i] = input_sc.next();
		}
		System.out.println("------------------------------------------------------------------------");
	}

	public static void setLaptop(String Brand)
	{
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("< %s Laptop Form Input Area>\n", Brand);
		laptop = new LaptopModel[OBJControl.laptopCount];
		for (int i = 0; i < OBJControl.laptopCount; i++)
		{
			input_sc.nextLine();
			laptop[i] = new LaptopModel(Brand);
			System.out.print("Input Model name >> "); String Name = input_sc.nextLine();
			System.out.print("Input coast >> "); int coast = input_sc.nextInt();
			System.out.print("Input Model display size >> "); float dis_size = input_sc.nextFloat();
			laptop[i] = new LaptopModel(Brand, Name, coast, dis_size);
		}
		System.out.println("------------------------------------------------------------------------");
	}

	public static void getAllData()
	{
		for (int i = 0; i < OBJControl.laptopCount; i++)
		{
			System.out.printf("< %s Brand >\n", laptop[i].getBrand());
			System.out.printf("Model Name : %s \n", laptop[i].getModel_name());
			System.out.printf("Model coast : %d \n", laptop[i].getModel_coast());
			System.out.printf("Model Display Size : %.2f \n", laptop[i].getModel_Display());
			System.out.println();
		}
	}
}
