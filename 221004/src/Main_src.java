import java.util.Scanner;

public class Main_src
{
    public static void main(String[] args) throws Exception
    {
        calculator();
    }

    static Scanner input_sc = new Scanner(System.in);
    public static void calculator()
    {
        String mode;
        int one , two;
        
        Plus p = new Plus(0,0);
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();

        System.out.println("<Example> ");
        p.getValue();
        
        while (true)
        {
            System.out.print("choose cal mode >> "); mode = input_sc.next();

            if (mode.equals("exit"))
            {
                System.out.println("Program end");
                System.exit(0);
            }

            System.out.print("Input two number >> "); one = input_sc.nextInt(); two = input_sc.nextInt(); 
            
            if (mode.equals("+"))
            {
                p.setValue(one, two);
                System.out.println(one+" + "+two+" = "+p.getPlus());
            }
            else if (mode.equals("-"))
            {
                s.setValue(one, two);
                System.out.println(one+" - "+two+" = "+s.getSub());
            }
            else if (mode.equals("*"))
            {
                m.setValue(one, two);
                System.out.println(one+" * "+two+" = "+m.getMul());
            }
            else if (mode.equals("/"))
            {
                d.setValue(one, two);
                System.out.printf(one+" / "+two+" = %.2f", d.getDiv());
            }
            else
            {
                System.out.println("No mode, re input");
            }
            System.out.println();
        }
    }
}