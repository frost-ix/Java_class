import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner input_sc = new Scanner(System.in);

        // IPTV tv = new IPTV(input_sc.next(), input_sc.next(), input_sc.nextInt());
        // tv.getStatus();

        QLED qtv = new QLED(input_sc.next(), input_sc.nextInt(), input_sc.nextInt());
        qtv.getStatus();

        input_sc.close();
    }

    public static void test()
    {
        // Color c = new Color();
        // c.setVal(input_sc.nextInt(), input_sc.nextInt());
        // c.getVal();

        // ColorPoint cp = new ColorPoint();
        // cp.setVal(input_sc.nextInt(), input_sc.nextInt());
        // cp.setColor(input_sc.next());
        // cp.getColor();

        // Person p = new Person(input_sc.next());
        // Stu st = new Stu(input_sc.next());
        // StuWorker stuWork = new StuWorker(input_sc.next());
        // Researcher rsh = new Researcher(input_sc.next());
        // Proff proff = new Proff(input_sc.next());

        // stuWork.doWork();
        // proff.doTeach();

        // Test_3 t3 = new Test_3();
        // Test_3 t3int = new Test_3(10);
    }
}