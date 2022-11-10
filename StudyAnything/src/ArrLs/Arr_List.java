package ArrLs;
import java.util.ArrayList;
import java.util.Scanner;

public class Arr_List
{
	static Scanner input_sc = new Scanner(System.in);
	public static void listControl()
	{
		ArrayList<Note> book = new ArrayList<Note>();
		inputArray(book);
		showArrList(book);
	}
	public static void inputArray(ArrayList<Note> Args)
	{
		boolean isOdd;
		int bool_check;
		while (true)
		{
			System.out.println("Select mode"); System.out.println("Odd : Add"); System.out.println("Even : End");
			isOdd = input_sc.nextInt()%2 == 0;
			bool_check = (isOdd) ? 1:0;
			switch (bool_check)
			{
				case 1:
				{
					System.out.println("Input Price & Name");
					Args.add(new Note(input_sc.nextInt(), input_sc.next()));
					break;
				}
				default:
					return;
			}

		}
	}
	public static void showArrList(ArrayList<Note> Args)
	{
		for (int i = 0; i < Args.size(); i++)
		{
			System.out.println((i+1)+"Round Data");
			System.out.println(Args.get(i));
		}
	}
}