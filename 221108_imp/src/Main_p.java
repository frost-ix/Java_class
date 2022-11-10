import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        String line = "------------------";
        smart sp = new smart();
        smart ip = new smart();

        getData(sp);
        System.out.println(line);
        getData(ip);
        
    }
    public static Scanner input_sc = new Scanner(System.in);
    public static void getData(smart obj)
    {
        String line = "------------------";
        String logo = input_sc.next();
        int num1 = input_sc.nextInt(); int num2 = input_sc.nextInt();
        String inside_call = input_sc.next();
        String inside_mail = input_sc.next();
        String music = input_sc.next();
        
        obj.printLogo(logo);
        System.out.println(line);
        
        System.out.println(obj.cal(num1,num2));
        System.out.println(line);
    
        obj.sendCall(inside_call);
        obj.recCall();
        System.out.println(line);
    
        obj.sendMail(inside_mail);
        obj.recMail();
        System.out.println(line);
    
        obj.play(music);
        obj.stop(music);
        System.out.println(line);
    
        obj.schedule();
        System.out.println(line);
    }
}
