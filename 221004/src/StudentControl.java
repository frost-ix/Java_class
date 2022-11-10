import java.util.Scanner;

public class StudentControl
{
	static Scanner input_sc = new Scanner(System.in);
	public static void test()
	{
		StudentOBJ stu = new StudentOBJ();

		System.out.println("<FORM>");
		System.out.println("name : "+stu.getName());
		System.out.println("sum : "+stu.getSum());
		System.out.println("avg : "+stu.getAVG());
	}
	public static void routine(StudentOBJ student)
	{
		for (int i = 0; i < student.getScore(); i++)
		{
			
		}
	}
}