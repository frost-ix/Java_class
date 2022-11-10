import java.util.Scanner;

public class Progr
{
	public static void logical()
	{
		Scanner input_sc = new Scanner(System.in);
		int num , count = 0;
		num = input_sc.nextInt();
		while (num!=1||count>=500)
		{
			if (num%2==0)
			{
				num/=2;
				count++;
			}
			else
			{
				num = num*3 +1;
				count++;
			}
		}
		if (count < 500)
		{
			System.out.println("Runtime : "+count);
		}
		else
		{
			System.out.println("Error : "+-1);
		}
		input_sc.close();
	}
}