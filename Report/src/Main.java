import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        
    }

    public static void runSingleOBJ()
    {
        String line = "------------------------------------------------------------";
        Scanner input_sc = new Scanner(System.in);
        Parent p;
        p = new Parent(input_sc.next(), input_sc.nextInt());
        System.out.println("------------ Parent Area -----------");
        p.getData();

        System.out.println(line);
        p = new Child1(input_sc.next(), input_sc.nextInt(), input_sc.next());

        p.getData();
        System.out.println(line);

        p = new Child2(input_sc.next(), input_sc.nextInt(), input_sc.next());

        p.getData();
        System.out.println(line);

        p = new Child3(input_sc.next(), input_sc.nextInt(), input_sc.next());

        p.getData();
        System.out.println(line);

        input_sc.close();
    }
}