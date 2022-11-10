import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ab_over();
    }

    public static void ab_over()
    {
        Abp ap = new Abc();
        ap.getPrint();
        System.out.println(ap.calc(10, 5));

        ap = new Abc2();
        ap.getPrint();
        System.out.println(ap.calc(8, 3));
    }

    public static void ab_test()
    {
        Scanner input_sc = new Scanner(System.in);
        GoodCal gc = new GoodCal();

        System.out.println(gc.add(input_sc.nextInt(), input_sc.nextInt()));
        System.out.println(gc.subtract(input_sc.nextInt(), input_sc.nextInt()));
        System.out.println();

        input_sc.close();
    }
}