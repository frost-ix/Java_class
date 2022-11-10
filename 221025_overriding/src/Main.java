public class Main
{
    public static void main(String[] args) throws Exception
    {
        Shape sh = new Shape(); sh.getPrint();
        Line ln = new Line(); ln.getPrint();
        Circle cir = new Circle();
        Rect rct = new Rect();

        System.out.println("----------------------");
        
        sh = new Line();
        System.out.println("<Upcasting>");
        sh.getPrint();
        
        System.out.println("----------------------");

        sh = new Circle();
        System.out.println("<Upcasting>");
        cir.getPrint();
        
        System.out.println("----------------------");
        
        sh = new Rect();
        System.out.println("<Upcasting>");
        rct.getPrint();
        
        System.out.println("----------------------");
    }
}