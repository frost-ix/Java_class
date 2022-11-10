public class Thread_test
{
    public static void main(String[] args)
    {
        Test_src.setData();
        System.out.println("<Test Exception>");
        System.out.println("Suc count : "+Test_src.checkSuc());
        System.out.println("Except count : "+Test_src.checkExcept());
        System.out.println("<All data>");
        Test_src.getArr_data();
    }
}