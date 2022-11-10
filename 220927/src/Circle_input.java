import java.util.Scanner;

class Circle_input
{
	static Scanner input_sc = new Scanner(System.in);
	public static void name()
	{
		Circle Pizza = new Circle(input_sc.next(),input_sc.nextInt());
		// Circle Donut = new Circle(input_sc.next(),input_sc.nextInt());
		// Circle Tire = new Circle(input_sc.next(),input_sc.nextInt());

		double circle_area, circle_round;

		System.out.println(Pizza.name+" Area : "+Pizza.getArea());
		System.out.println(Pizza.name+" Round : "+Pizza.getRound());

		// Pizza.name = input_sc.next();
		// Pizza.radius = input_sc.nextInt();
		circle_area = Pizza.getArea();
		circle_round = Pizza.getRound();

		System.out.println(Pizza.name+" area : "+circle_area);
		System.out.println(Pizza.name+" area : "+circle_round);

		// Donut.name = input_sc.next();
		// Donut.radius = input_sc.nextInt();
		// circle_area = Donut.getArea();
		// circle_round = Pizza.getRound();

		// System.out.println(Donut.name+" area : "+circle_area);
		// System.out.println(Donut.name+" area : "+circle_round);

		// Tire.name = input_sc.next();
		// Tire.radius = input_sc.nextInt();
		// circle_area = Tire.getArea();
		// circle_round = Pizza.getRound();

		// System.out.println(Tire.name+" area : "+circle_area);
		// System.out.println(Tire.name+" area : "+circle_round);
	}
}
