import java.util.Scanner;

public class Main_src
{
    static Scanner input_sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        OBJControl.getIntroduce();
        OBJControl.setLength();
        OBJControl.setBrandName();
        for (int i = 0; i < OBJControl.All; i++)
        {
            OBJControl.setLaptop(OBJControl.BrandName[i]);
            OBJControl.getAllData();
        }
    }
}
