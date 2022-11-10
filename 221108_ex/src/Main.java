import java.util.Scanner;

public class Main
{
    public static void introduce()
    {
        String line = "---------------------";
        System.out.println(line);
        System.out.println("inch -> cm : 1");
        System.out.println("mm -> m : 2");
        System.out.println("byte -> mega : 3");
        System.out.println("m^2 -> peyong : 4");
        System.out.println("End : 5");
        
    }
    public static void main(String[] args) throws Exception
    {
        Scanner input_sc = new Scanner(System.in);
        length_test lt = new length_test();

        int select, inch,mm , byt, size;
        while (true)
        {
            introduce();
            System.out.print("Input module >> "); select = input_sc.nextInt();
            switch (select)
            {
                case 1:
                {
                    System.out.print("Input inch : "); inch = input_sc.nextInt();
                    System.out.println("CM : "+lt.calInch(inch));
                    break;
                }
                case 2:
                {
                    System.out.print("Input mm : "); mm = input_sc.nextInt();
                    System.out.println("M : "+lt.calM(mm));
                    break;
                }
                case 3:
                {
                    System.out.print("Input byte : "); byt = input_sc.nextInt();
                    System.out.println("mb : "+lt.calMb(byt));
                    System.out.println("other byte : "+lt.calByte(byt));
                    break;
                }
                case 4:
                {
                    System.out.print("Input m^2 : "); size = input_sc.nextInt();
                    System.out.println("Peyong : "+lt.calP(size));
                    break;
                }
                case 5:
                {
                    input_sc.close();
                    System.out.println("System end");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Input error");
                    break;
                }
            }
        }
    }
}
