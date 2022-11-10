import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner input_sc = new Scanner(System.in);
        int num1, num2;
        String fx;
        
        System.out.println("Cal sys");
        while(true)
        {
            System.out.println("input 2 number");
            num1 = input_sc.nextInt(); num2 = input_sc.nextInt();
            
            System.out.print("select function >> "); fx = input_sc.next();
            System.out.println("Now fuction is : "+fx);
            if (fx.equals("+"))
            {
                System.out.println("Add area");
                Add add = new Add(num1, num2);
                add.getNums();
                add.setResult();
                System.out.println("reslut : "+add.getResult()); 
            }
            else if (fx.equals("-"))
            {
                System.out.println("Sub area");
                Sub sub = new Sub(num1, num2);
                sub.getNums();
                sub.setResult();
                System.out.println("reslut : "+sub.getResult());
            }
            else if (fx.equals("*"))
            {
                System.out.println("Mul area");
                Mul mul = new Mul(num1, num2);
                mul.getNums();
                mul.setResult();
                System.out.println("reslut : "+mul.getResult());
            }
            else if (fx.equals("/"))
            {
                System.out.println("Div area");
                Div div = new Div(num1, num2);
                div.getNums();
                div.setResult();
                System.out.println("reslut : "+div.getResult());
            }
            else if(fx.equals("x"))
            {
                System.out.println("End");
                System.exit(0);
            }
            else
            {
                System.out.println("No variable. retry");
            }
        }
    }
}