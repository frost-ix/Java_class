import java.util.Scanner;

public class Car_obj_input
{
	static Scanner input_sc = new Scanner(System.in);
	public static void name()
	{
		Car_obj porshe = new Car_obj(input_sc.next(),input_sc.next(),input_sc.nextInt());
		porshe.getCarData();
		porshe.doRun();
		System.out.print("Speed up : ");
		porshe.sumSpeed(input_sc.nextInt());
		porshe.doRun();
		porshe.doStop();
	}
}
