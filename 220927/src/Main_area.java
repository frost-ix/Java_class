import java.util.Scanner;

public class Main_area
{
	static Scanner input_sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		IQ_obj iqArr [] = new IQ_obj[3];
		float avg = 0;
		for (int i = 0; i < iqArr.length; i++)
		{
			System.out.print("Input name >> "); String input_str = input_sc.next();
			System.out.print("Input Number >> "); int input_num = input_sc.nextInt();
			System.out.print("Input IQ >> "); int input_iq = input_sc.nextInt();
			iqArr[i] = new IQ_obj(input_str, input_num, input_iq);
			avg += iqArr[i].getIq();
		}
		for (int i = 0; i < iqArr.length; i++)
		{
			System.out.println("<"+i+1+" person >");
			System.out.println("Name : "+iqArr[i].getName());
			System.out.println("Number : "+iqArr[i].getNumber());
			System.out.println("IQ : "+iqArr[i].getIq());
			System.out.println();
			System.out.println("IQ Avg : "+avg/iqArr.length);
			System.out.println();
		}
	}
}