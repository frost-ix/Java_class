import java.util.Scanner;

public class TV_obj_input
{
	static Scanner input_sc = new Scanner(System.in);
	public static void name()
	{
		Tv_obj TV = new Tv_obj(input_sc.next(), input_sc.nextInt());
		TV.getTvData();
		System.out.println("Input + : Plus Channel");
		System.out.println("Input - : Minus Channel");
		System.out.println("Input Off : TV OFF");
		while (true)
		{
			TV.getChannel();
			String mode = input_sc.next();
			System.out.print("Input Mode >> "+mode+"\n");
			if (mode.equals("+"))
			{
				TV.sumChannel();
			}
			else if (mode.equals("-"))
			{
				TV.minusChannel();
			}
			else if (mode.equals("Off"))
			{
				System.out.println("TV OFF");
				System.exit(0);
			}
			else
			{
				System.out.println("Retry!!");
			}
		}
	}
}
