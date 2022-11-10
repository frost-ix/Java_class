import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {
        Scanner input_sc = new Scanner(System.in);
        Ani ani = new Ani();

        System.out.println("--------------------------------------");
        System.out.println("<Tiger>");
        ani = new Tiger("tiger", input_sc.nextInt());
        
        ani.getStat();
        
        System.out.println("--------------------------------------");
        System.out.println("<Monkey>");
        ani = new Monkey("monkey", input_sc.nextInt());
        
        ani.getStat();
        
        System.out.println("--------------------------------------");
        System.out.println("<Girf>");
        ani = new Girf("Girf", input_sc.nextInt());
        
        ani.getStat();
        System.out.println("--------------------------------------");
        input_sc.close();
    }
}