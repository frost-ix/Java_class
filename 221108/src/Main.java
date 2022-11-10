public class Main extends data implements bottom
{
    public static void main(String[] args) throws Exception
    {
        Main m = new Main();

        m.print();
        m.show();
        m.show2();
        m.disp();
    }
    
    @Override
    public void show()
    {
        System.out.println("show : "+num);
    }
    @Override
    public void show2()
    {
        System.out.println("show2 : "+num2);
    }
    @Override
    public void disp()
    {
        System.out.println("dis : "+number);
    }
}